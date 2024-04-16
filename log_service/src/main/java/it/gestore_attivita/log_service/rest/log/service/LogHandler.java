package it.gestore_attivita.log_service.rest.log.service;



import it.gestore_attivita.log_service.kafka.avro.AttivitaRequestKey;
import it.gestore_attivita.log_service.kafka.avro.AttivitaRequestValue;
import it.gestore_attivita.log_service.rest.log.dto.AttivitaRequestDto;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.common.protocol.types.Field;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;

import static org.slf4j.LoggerFactory.getLogger;

@Aspect
@Component
public class LogHandler {

    private final Logger log = getLogger(this.getClass());

    @Before("execution(public * it.gestore_attivita.log_service.rest.log.LogController." +
            "logInsertAttivita(*))")
    public void logInserimentoAttività(JoinPoint joinPoint){
        AttivitaRequestDto request = (AttivitaRequestDto)joinPoint.getArgs()[0];
        log.info(String.format("Attività %s inserita nel db",request.toString()));

    }


    @Before("execution(public * it.gestore_attivita.log_service.rest.log" +
            ".LogController.logVerificaAttivita(*))")
    public void logVerificaAttività(JoinPoint joinPoint){
        AttivitaRequestDto request = (AttivitaRequestDto)joinPoint.getArgs()[0];
        log.info(String.format("Attività #%d è stata verificata",request.getId()));

    }

    @Before("execution(public * it.gestore_attivita.log_service.rest.log" +
            ".LogController.logLavoraAttivita(*))")
    public void logLavorazioneAttività(JoinPoint joinPoint){
        AttivitaRequestDto request = (AttivitaRequestDto)joinPoint.getArgs()[0];
        log.info(String.format("Attività #%d è stata lavorata",request.getId()));

    }

    @Before("execution(public * it.gestore_attivita.log_service.rest.log" +
            ".LogController.logGetAttivitaById(*))")
    public void logFetcAttivitaById(JoinPoint joinPoint){
        Long id = (Long)joinPoint.getArgs()[0];
        log.info(String.format("Attività #%d prelevata dal DB con successo",id));

    }

    @Before("execution(public * it.gestore_attivita.log_service.rest.log" +
            ".LogController.logGetAllAttivita())")
    public void logFetcAllAttivitas(){
        log.info("Tutte le attività sono state recuperate dal DB");
    }

    /*@Before("execution(public void it.gestore_attivita.log_service.kafka.KafkaConsumer" +
            ".consumeKafkaMessage(org.apache.kafka.clients.consumer.ConsumerRecord))")
    public void logKafkaHandler(JoinPoint jp){
        log.info("Messaggio Kafka Ricevuto");
        ConsumerRecord<AttivitaRequestKey, AttivitaRequestValue> record = (ConsumerRecord<AttivitaRequestKey, AttivitaRequestValue>)jp.getArgs()[0];
        AttivitaRequestKey key = record.key();
        AttivitaRequestValue value = record.value();

        log.info(String.format("Chiave del messaggio Kafka: %s",key.getId()));
        log.info(String.format("Body del messaggio Kafka: %s",value.toString()));
    }*/
}
