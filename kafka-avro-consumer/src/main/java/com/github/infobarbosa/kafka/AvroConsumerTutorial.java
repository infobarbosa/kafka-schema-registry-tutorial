package com.github.infobarbosa.kafka;

import io.confluent.kafka.serializers.KafkaAvroDeserializer;
import org.apache.kafka.clients.consumer.*;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collections;
import java.util.Properties;

public class AvroConsumerTutorial {
    private final static Logger logger = LoggerFactory.getLogger(AvroConsumerTutorial.class);

    public static void main(String[] args) {
        final String BOOTSTRAP_SERVERS_CONFIG = System.getenv("BOOTSTRAP_SERVERS_CONFIG");
        final String SCHEMA_REGISTRY_URL = System.getenv("SCHEMA_REGISTRY_URL");

        logger.info("BOOTSTRAP_SERVERS_CONFIG: " + BOOTSTRAP_SERVERS_CONFIG);
        logger.info("SCHEMA_REGISTRY_URL: " + SCHEMA_REGISTRY_URL);

        Properties properties = new Properties();
        properties.setProperty(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, BOOTSTRAP_SERVERS_CONFIG);
        properties.setProperty(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, "false");
        properties.setProperty(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
        properties.setProperty(ConsumerConfig.GROUP_ID_CONFIG, "cliente-consumer");
        properties.setProperty(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
        properties.setProperty(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, KafkaAvroDeserializer.class.getName());
        properties.setProperty("schema.registry.url", SCHEMA_REGISTRY_URL);
        properties.setProperty("specific.avro.reader", "true");

        Consumer<String, PagamentoAprovado> clienteConsumer = new KafkaConsumer<>(properties);

        String topic = "pagamento-aprovado";
        clienteConsumer.subscribe(Collections.singleton(topic));

        while (true){
            ConsumerRecords<String, PagamentoAprovado> records = clienteConsumer.poll(1000);
            logger.info("lendo...");
            for (ConsumerRecord<String, PagamentoAprovado> record : records){
                PagamentoAprovado pagamento = record.value();
                logger.info(pagamento.toString());
            }

            clienteConsumer.commitSync();
        }
    }
}
