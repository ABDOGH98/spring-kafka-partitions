package com.sid.kafkafactory.factory;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(id ="sii0" , topicPartitions = {@TopicPartition(topic = "sii", partitions = {"0"})})
    void listener0(String data){
        System.out.println("receive from 0 -> "+data);
    }

    @KafkaListener(id ="sii1" , topicPartitions = {@TopicPartition(topic = "sii", partitions = {"1"})})
    void listener1(String data){
        System.out.println("receive from 1 -> "+data);
    }
}
