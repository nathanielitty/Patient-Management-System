package com.pm.patientservice.kafka;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class kafkaProducer {
   private final KafkaTemplate<String, byte[]>  kafkaTemplate;

   public kafkaProducer(KafkaTemplate<String, byte[]> kafkaTemplate) {
       this.kafkaTemplate = kafkaTemplate;
   }
}
