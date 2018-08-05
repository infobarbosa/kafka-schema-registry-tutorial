package com.github.infobarbosa.kafka.tutorial.schemaregistry.cliente;

import com.github.infobarbosa.kafka.tutorial.schemaregistry.Cliente;
import io.confluent.kafka.serializers.KafkaAvroDeserializer;
import org.apache.kafka.clients.consumer.*;
import org.apache.kafka.common.serialization.StringDeserializer;

import java.util.Collections;
import java.util.Properties;

public class ClienteAvroConsumerDemo {
    public static void main(String[] args) {

        Properties properties = new Properties();
        properties.setProperty(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
        properties.setProperty(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, "false");
        properties.setProperty(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
        properties.setProperty(ConsumerConfig.GROUP_ID_CONFIG, "cliente-consumer");
        properties.setProperty(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
        properties.setProperty(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, KafkaAvroDeserializer.class.getName());
        properties.setProperty("schema.registry.url", "http://127.0.0.1:8081");
        properties.setProperty("specific.avro.reader", "true");

        Consumer<String, Cliente> clienteConsumer = new KafkaConsumer<>(properties);

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
