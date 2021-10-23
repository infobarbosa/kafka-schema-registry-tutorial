package com.github.infobarbosa.kafka;

import io.confluent.kafka.serializers.protobuf.KafkaProtobufDeserializer;
import java.util.Collections;
import java.util.Properties;
import org.apache.kafka.clients.consumer.*;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.github.infobarbosa.kafka.PagamentoAprovadoOuterClass.PagamentoAprovado;

@SpringBootApplication
public class KafkaProtobufConsumerApplication implements CommandLineRunner{
	private static Logger logger = LoggerFactory.getLogger(KafkaProtobufConsumerApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(KafkaProtobufConsumerApplication.class, args);
	}

    @Override
    public void run(String... args) {

        final String BOOTSTRAP_SERVERS_CONFIG = System.getenv("BOOTSTRAP_SERVERS_CONFIG");
        final String SCHEMA_REGISTRY_URL = System.getenv("SCHEMA_REGISTRY_URL");

        logger.info("BOOTSTRAP_SERVERS_CONFIG: " + BOOTSTRAP_SERVERS_CONFIG);
        logger.info("SCHEMA_REGISTRY_URL: " + SCHEMA_REGISTRY_URL);

        Properties properties = new Properties();
        properties.setProperty(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, BOOTSTRAP_SERVERS_CONFIG);
        properties.setProperty(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, "false");
        properties.setProperty(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
        properties.setProperty(ConsumerConfig.GROUP_ID_CONFIG, "kafka-protobuf-consumer");
        properties.setProperty(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
        properties.setProperty(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, KafkaProtobufDeserializer.class.getName());
        properties.setProperty("schema.registry.url", SCHEMA_REGISTRY_URL);
        properties.setProperty("specific.avro.reader", "true");

        Consumer<String, PagamentoAprovado> pagamentoConsumer = new KafkaConsumer<>(properties);

        String topic = "pagamento-aprovado";
        pagamentoConsumer.subscribe(Collections.singleton(topic));

        while (true){
            ConsumerRecords<String, PagamentoAprovado> records = pagamentoConsumer.poll(1000);
            logger.info("lendo...");
            for (ConsumerRecord<String, PagamentoAprovado> record : records){
                PagamentoAprovado pagamento = record.value();
                logger.info(pagamento.toString());
            }

            pagamentoConsumer.commitSync();
        }        
    }
}
