package it.gestore_attivita.log_service.rest;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONTINUE)
@AllArgsConstructor
@Data
public class Response1xx {
    private Boolean flag;
}
