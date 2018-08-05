package com.github.infobarbosa.kafka.tutorial.schemaregistry;

import com.github.infobarbosa.kafka.tutorial.schemaregistry.streamfactory.KafkaConsumerFactory;
import org.apache.kafka.clients.consumer.*;

import java.util.Collections;

public class ClienteAvroConsumerDemo {
    public static void main(String[] args) {

        Consumer<String, Cliente> clienteConsumer = KafkaConsumerFactory.getInstance();

        String topic = "cliente";
        clienteConsumer.subscribe(Collections.singleton(topic));

        while (true){
            ConsumerRecords<String, Cliente> records = clienteConsumer.poll(1000);
            System.out.println("lendo...");
            for (ConsumerRecord<String, Cliente> record : records){
                Cliente cliente = record.value();
                System.out.println(cliente);
            }

            clienteConsumer.commitSync();
        }
    }
}
