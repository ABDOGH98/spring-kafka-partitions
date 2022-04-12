package com.sid.kafkafactory.factory;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(id ="sii0" , topicPartitions = {@TopicPartition(topic = "sii", partitions = {"0"})})
    void listener0(ConsumerRecord<String,Object> data){
        System.out.println("partition : "+data.partition()+" - key : "+ data.key()+" - value : "+data.value());
    }

    @KafkaListener(id ="sii1" , topicPartitions = {@TopicPartition(topic = "sii", partitions = {"1"})})
    void listener1(ConsumerRecord<String,Object> data){
        System.out.println("partition : "+data.partition()+" - key : "+ data.key()+" - value : "+data.value());
    }
}
