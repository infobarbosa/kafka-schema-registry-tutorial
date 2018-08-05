package com.github.infobarbosa.kafka.tutorial.schemaregistry.streamfactory;

import com.github.infobarbosa.kafka.tutorial.schemaregistry.Cliente;
import io.confluent.kafka.serializers.KafkaAvroDeserializer;
import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;

import java.util.Properties;

public class KafkaConsumerFactory {

    private static KafkaConsumer<String, Cliente> clienteConsumer = null;

    public static Consumer<String, Cliente> getInstance(){
        if( clienteConsumer == null ){
            Properties properties = new Properties();
            properties.setProperty(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
            properties.setProperty(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, "false");
            properties.setProperty(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
            properties.setProperty(ConsumerConfig.GROUP_ID_CONFIG, "cliente-consumer");
            properties.setProperty(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
            properties.setProperty(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, KafkaAvroDeserializer.class.getName());
            properties.setProperty("schema.registry.url", "http://127.0.0.1:8081");
            properties.setProperty("specific.avro.reader", "true");

            clienteConsumer = new KafkaConsumer<>(properties);

        }

        return clienteConsumer;
    }
}
