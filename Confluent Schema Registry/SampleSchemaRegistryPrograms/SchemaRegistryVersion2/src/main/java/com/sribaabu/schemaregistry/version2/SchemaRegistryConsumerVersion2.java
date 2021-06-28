package com.sribaabu.schemaregistry.version2;

import java.util.Collections;
import java.util.Properties;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;

import com.sribaabu.Employee;

import io.confluent.kafka.serializers.KafkaAvroDeserializer;

/**
 * Hello world!
 *
 */
public class SchemaRegistryConsumerVersion2 {
	public static void main(String[] args) {

		// Configuring Normal Consumer

		Properties properties = new Properties();
		properties.setProperty(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
		properties.setProperty(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());

//      DeSerializer Should be used as Kafka Avro DeSerializer
		properties.setProperty(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, KafkaAvroDeserializer.class.getName());
		properties.setProperty("specific.avro.reader", "true");

		properties.setProperty(ConsumerConfig.GROUP_ID_CONFIG, "sribaabu-app");
		properties.setProperty(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, "false");
		properties.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");

//        The Actual Schema Registry Server URL
		properties.setProperty("schema.registry.url", "http://127.0.0.1:8081");

		KafkaConsumer<String, Employee> kafkaConsumer = new KafkaConsumer<>(properties);

		String topic = "sribaabu-schema-registry-topic";
		kafkaConsumer.subscribe(Collections.singleton(topic));

		System.out.println("Waiting for the data from kafka ...");

		while (true) {
			System.out.println("Polling Kafka");
			ConsumerRecords<String, Employee> records = kafkaConsumer.poll(1000);

			for (ConsumerRecord<String, Employee> record : records) {
				Employee employee = record.value();
				System.out.println(employee);
			}

			kafkaConsumer.commitSync();
		}
	}

}
