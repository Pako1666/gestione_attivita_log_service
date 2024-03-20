package it.gestore_attivita.log_service.rest.log;

import io.swagger.annotations.ResponseHeader;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.headers.Header;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import it.gestore_attivita.log_service.rest.log.dto.AttivitaRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.TaskExecutor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Tag(name="Log")
@RestController
@RequestMapping("v1/logs-api/")
@CrossOrigin(origins = "http://localhost:8080")
public class LogController {


    @Autowired
    TaskExecutor taskExecutor;


    @Operation(summary = "traccia i log della lavorazione delle attività")
    @PostMapping("lavora-attivita")

    public ResponseEntity logLavoraAttivita(AttivitaRequestDto req){

        taskExecutor.execute(
                ()->ResponseEntity.status(200).body(true)
        );

        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body(true)
                ;
    }

    @Operation(summary = "traccia i log della verifica delle attività")
    @PostMapping(value = "verifica-attivita")
    public ResponseEntity<Boolean> logVerificaAttivita(AttivitaRequestDto req){

        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body(true)
                ;
    }

    @Operation(summary = "traccia i log dell' inserimento delle attività")
    @PostMapping(value = "insert-attivita", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Boolean> logInsertAttivita(@RequestBody AttivitaRequestDto req){

        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body(true)
                ;
    }

    @Operation(summary = "traccia nei log l'attività ottenuta dal suo id")
    @GetMapping("fetch-attivita/{id}")
    public ResponseEntity<Boolean> logGetAttivitaById(@PathVariable("id")  Long id){

        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body(true);
    }

    @Operation(summary = "traccia nei log tutte le attività")
    @GetMapping(value = "fetch-attivita/all",produces = "application/json")
    public ResponseEntity<Boolean> logGetAllAttivita(){
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body(true);
    }

    /*@Operation(summary = "prova di una chiamata async")
    @ApiResponse(
            responseCode = "202",
            description = "prova di una chiamata async",
            useReturnTypeSchema = true
    )

    @PostMapping(value = "chiamata-async")
    public ResponseEntity<String> asyncText(){
        //HttpHeaders headers = new HttpHeaders();
        //headers.add(HttpHeaders.EXPECT, "100-continue");
        ResponseEntity<String> resp = ResponseEntity
                .status(HttpStatus.ACCEPTED)
                //.headers(headers)
                .build();


        return resp;
    }*/


}
