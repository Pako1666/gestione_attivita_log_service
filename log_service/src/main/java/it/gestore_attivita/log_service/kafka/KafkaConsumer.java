package it.gestore_attivita.log_service.kafka;

import it.gestore_attivita.log_service.kafka.avro.AttivitaRequestKey;
import it.gestore_attivita.log_service.kafka.avro.AttivitaRequestValue;
import lombok.extern.slf4j.Slf4j;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericRecord;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;


@Component
public class KafkaConsumer {


    @KafkaListener(topics = "gestoreAtt", groupId = "gestione_attivita_kafka")
    public void consumeKafkaMessage(ConsumerRecord<AttivitaRequestKey,AttivitaRequestValue> msg){
        AttivitaRequestKey key = msg.key();
        System.out.println(key);
    }






}

