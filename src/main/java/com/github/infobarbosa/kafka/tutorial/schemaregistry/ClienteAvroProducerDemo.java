package com.github.infobarbosa.kafka.tutorial.schemaregistry;

import com.github.infobarbosa.kafka.tutorial.schemaregistry.streamfactory.KafkaProducerFactory;
import org.apache.kafka.clients.producer.*;

public class ClienteAvroProducerDemo {
    public static void main(String[] args) {


        Producer<String, Cliente> producer = KafkaProducerFactory.getInstance();

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
