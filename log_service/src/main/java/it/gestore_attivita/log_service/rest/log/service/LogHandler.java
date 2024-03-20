package it.gestore_attivita.log_service.rest.log.service;


import it.gestore_attivita.log_service.rest.log.dto.AttivitaRequestDto;
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
/*
    @Before("execution(" +
            "public * it.gestore_attivita.log_service.rest.log.service" +
            ".LogService.getAttivita(Long)" +
            ")")
    public void logGetActivityFromDB(JoinPoint joinPoint){
        log.info(String.format("Recuperando l'attivita #%d dal db",joinPoint.getArgs()[0]));
    }*/

//    @Before("execution(" +
//            "public * it.gestore_attivita.log_service.rest.log.service" +
//            ".LogService.verificaAttivita(Long)" +
//            ")")
//    public void logVerificaAttività(JoinPoint joinPoint){
//        log.info(String.format("Verificando se l'attivita #%d sia lavorabile, oppure no",joinPoint.getArgs()[0]));
//    }
//
//    @Before("execution(" +
//            "public * it.gestore_attivita.gestore_attivita.rest.log" +
//            ".service.LogService.lavorazioneAttivita(Long)" +
//            ")")
//    public void logLavoraAttivita(JoinPoint joinPoint){
//        log.info(String.format("Lavorando l'attivita #%d ",joinPoint.getArgs()[0]));
//    }

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
}
