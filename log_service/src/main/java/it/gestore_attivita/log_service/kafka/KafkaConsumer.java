package it.gestore_attivita.log_service.kafka;

import it.gestore_attivita.log_service.kafka.avro.AttivitaListSchema;
import it.gestore_attivita.log_service.kafka.avro.AttivitaRequestGenerated;
import it.gestore_attivita.log_service.kafka.avro.AttivitaRequestKey;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;


@Component
public class KafkaConsumer {


    @KafkaListener(topics = "attivita_topic", groupId = "gestione_attivita_kafka")
    public void consumeAttivitaTopic(ConsumerRecord msg){

    }

    @KafkaListener(topics = "attivita_list_topic", groupId = "gestione_attivita_kafka")
    public void consumeAttivitaListTopic(ConsumerRecord msg){

    }




}

