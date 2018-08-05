package com.github.infobarbosa.kafka.tutorial.schemaregistry.streamfactory;

import com.github.infobarbosa.kafka.tutorial.schemaregistry.Cliente;
import io.confluent.kafka.serializers.KafkaAvroSerializer;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.common.serialization.StringSerializer;

import java.util.Properties;

public class KafkaProducerFactory {
    private static Producer<String, Cliente> clienteProducer =  null;

    public static Producer<String, Cliente> getInstance(){
        if( clienteProducer == null) {
            Properties properties = new Properties();
            properties.setProperty("bootstrap.servers", "127.0.0.1:9092");
            properties.setProperty("acks", "all");
            properties.setProperty("retries", "10");
            properties.setProperty("key.serializer", StringSerializer.class.getName());
            properties.setProperty("value.serializer", KafkaAvroSerializer.class.getName());
            properties.setProperty("schema.registry.url", "http://127.0.0.1:8081");

            clienteProducer = new KafkaProducer<String, Cliente>(properties);

        }

        return clienteProducer;
    }
}
