package com.conta.pagamento.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import static com.conta.pagamento.constants.Constants.REGISTRO_NAO_ENCONTADO;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(Long id){
        super(REGISTRO_NAO_ENCONTADO + id);
    }
}
