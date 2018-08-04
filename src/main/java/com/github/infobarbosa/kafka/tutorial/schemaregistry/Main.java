package com.github.infobarbosa.kafka.tutorial.schemaregistry;

import com.github.infobarbosa.kafka.tutorial.schemaregistry.Cliente;
import io.confluent.kafka.serializers.KafkaAvroSerializer;
import org.apache.kafka.clients.producer.*;
import org.apache.kafka.common.serialization.StringSerializer;

import java.util.Properties;

public class Main {
    public static void main(String[] args) {

        Properties properties = new Properties();
        properties.setProperty("bootstrap.servers", "127.0.0.1:9092");
        properties.setProperty("acks", "all");
        properties.setProperty("retries", "10");
        properties.setProperty("key.serializer", StringSerializer.class.getName());
        properties.setProperty("value.serializer", KafkaAvroSerializer.class.getName());
        properties.setProperty("schema.registry.url", "http://127.0.0.1:8081");

        Producer<String, Cliente> producer = new KafkaProducer<String, Cliente>(properties);

        String topic = "cliente";

        Cliente cliente  = Cliente.newBuilder()
                .setCpf("99988877742")
                .setId("1L")
                .setPrimeiroNome("Marcelo")
                .setSobrenome("Barbosa")
                .build();

        ProducerRecord<String, Cliente> producerRecord = new ProducerRecord<String, Cliente>(
                topic, cliente
        );

        System.out.println(cliente);
        producer.send(producerRecord, new Callback() {
            @Override
            public void onCompletion(RecordMetadata metadata, Exception exception) {
                if (exception == null) {
                    System.out.println(metadata);
                } else {
                    exception.printStackTrace();
                }
            }
        });

        producer.flush();
        producer.close();
    }
}
