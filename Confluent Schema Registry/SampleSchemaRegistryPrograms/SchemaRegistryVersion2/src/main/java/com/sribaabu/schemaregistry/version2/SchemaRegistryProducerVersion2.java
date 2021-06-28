package com.sribaabu.schemaregistry.version2;

import java.util.Properties;

import org.apache.kafka.clients.producer.Callback;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.apache.kafka.common.serialization.StringSerializer;

import com.sribaabu.Employee;

import io.confluent.kafka.serializers.KafkaAvroSerializer;

/**
 * Hello world!
 *
 */
public class SchemaRegistryProducerVersion2 
{
	public static void main(String[] args) {
		
        // Configuring Normal Producer
		
        Properties properties = new Properties();
        properties.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
        properties.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        
//        Serializer Should be used as Kafka Avro Serializer
        
        properties.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, KafkaAvroSerializer.class.getName());
        
//        The Actual Schema Registry Server URL
        properties.setProperty("schema.registry.url", "http://127.0.0.1:8081");

        
        KafkaProducer<String, Employee> producer = new KafkaProducer<String, Employee>(properties);

        String topic = "sribaabu-schema-registry-topic";

//        Constructing Employee Object with the Generation Avro Model Class 
        
        Employee employee = Employee.newBuilder()
                .setAge(34)
                .setFirstName("Sribaabu")
                .setLastName("Murthy")
                .setHeight(178f)
                .setWeight(75f)
                .setCity("Erode")
                .setCountry("India")
                .build();

        ProducerRecord<String, Employee> producerRecord = new ProducerRecord<String, Employee>(
                topic, employee
        );

        System.out.println(employee);
        
//        Sending the Serialized Data to the Topic
        
        producer.send(producerRecord, new Callback(){
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
