package com.github.infobarbosa.kafka;

import io.confluent.kafka.serializers.protobuf.KafkaProtobufSerializer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.UUID;
import org.apache.kafka.clients.producer.*;
import org.apache.kafka.common.serialization.StringSerializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.github.infobarbosa.kafka.PagamentoAprovadoOuterClass;
import com.github.infobarbosa.kafka.PagamentoAprovadoOuterClass.PagamentoAprovado;

@SpringBootApplication
public class KafkaProtobufProducerApplication implements CommandLineRunner{
	private static Logger logger = LoggerFactory.getLogger(KafkaProtobufProducerApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(KafkaProtobufProducerApplication.class, args);
	}

    @Override
    public void run(String... args) {

        Properties properties = new Properties();
        properties.setProperty("bootstrap.servers", System.getenv("BOOTSTRAP_SERVERS_CONFIG"));
        properties.setProperty("acks", "all");
        properties.setProperty("retries", "10");
        properties.setProperty("key.serializer", StringSerializer.class.getName());
        properties.setProperty("value.serializer", KafkaProtobufSerializer.class.getName());
        properties.setProperty("schema.registry.url", System.getenv("SCHEMA_REGISTRY_URL"));

        Producer<String, PagamentoAprovado> producer = new KafkaProducer<>(properties);

        PagamentoAprovado pagamento = null;
        String topic = "pagamento-aprovado-protobuf";

        for(int i=0; i < 100000; i++){
            //identificacao do pagamento
            UUID idPagamento = UUID.randomUUID();
            //identificacao do pedido
            UUID idPedido = UUID.randomUUID();

            //gerando a data de pagamento
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");    
            Date dataPagamento = new Date( System.currentTimeMillis() );

            pagamento = PagamentoAprovado.newBuilder()
                .setId( idPagamento.toString() )
                .setIdPedido( idPedido.toString() )
                .setValor( 10.0 )
                .setData( sdf.format( dataPagamento ) )
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
