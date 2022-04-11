package com.sid.kafkafactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class KafkaFactoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaFactoryApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(KafkaTemplate<String, String> template){
        return args -> {
            template.send("sii",1,"test-event","heelo abdo");
            template.send("sii",0,"test-event","heelo ziza");
        };
    }

}
