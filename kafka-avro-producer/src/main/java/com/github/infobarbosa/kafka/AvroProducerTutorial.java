package com.github.infobarbosa.kafka;

import io.confluent.kafka.serializers.KafkaAvroSerializer;
import org.apache.kafka.clients.producer.*;
import org.apache.kafka.common.serialization.StringSerializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Properties;
import java.util.UUID;

public class AvroProducerTutorial {
    private final static Logger logger = LoggerFactory.getLogger(AvroProducerTutorial.class);

    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("bootstrap.servers", System.getenv("BOOTSTRAP_SERVERS_CONFIG"));
        properties.setProperty("acks", "all");
        properties.setProperty("retries", "10");
        properties.setProperty("key.serializer", StringSerializer.class.getName());
        properties.setProperty("value.serializer", KafkaAvroSerializer.class.getName());
        properties.setProperty("schema.registry.url", System.getenv("SCHEMA_REGISTRY_URL"));

        Producer<String, PagamentoAprovado> producer = new KafkaProducer<>(properties);

        PagamentoAprovado pagamento = null;
        String topic = "pagamento-aprovado";

        for(int i=0; i < 100000; i++){
            UUID idPagamento = UUID.randomUUID();
            UUID idPedido = UUID.randomUUID();

            pagamento = PagamentoAprovado.newBuilder()
                .setId(idPagamento.toString())
                .setIdPedido(idPedido.toString())
                .setValor("10.00")
                .setData(System.currentTimeMillis())
                .build();

            ProducerRecord<String, PagamentoAprovado> producerRecord = 
                new ProducerRecord<String, PagamentoAprovado>(topic, idPagamento.toString(), pagamento);

            logger.info(pagamento.toString());
            producer.send(producerRecord, new Callback() {
                @Override
                public void onCompletion(RecordMetadata metadata, Exception exception) {
                    if (exception == null) {
                        logger.info(
                            "K: " + idPagamento.toString() +
                            ". P: " + metadata.partition() +
                            ". OS: " + metadata.offset() +
                            ". TS: " + metadata.timestamp()
                        );
                    } else {
                        exception.printStackTrace();
                    }
                }
            });

            //coloca pra dormir um pouco
            try {
                Thread.sleep(100);
            }
            catch(InterruptedException e){
                logger.error("problemas durante o sono.", e);
            }

        }

        producer.flush();
        producer.close();
    }
}
