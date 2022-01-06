package com.conta.pagamento.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.time.Instant;

@ControllerAdvice
public class ResourceExceptionHandler extends ResponseEntityExceptionHandler {

    public ResponseEntity<ErroPadrao> entityNotFound(ErroResposta.EntityNotFoundException e, HttpServletRequest request){
        ErroPadrao erroPadrao = new ErroPadrao();
        erroPadrao.setTimestamp(Instant.now());
        erroPadrao.setStatus(HttpStatus.NOT_FOUND.value());
        erroPadrao.setErro("Recurso não existe");
        erroPadrao.setMensagem(request.getRequestURI());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(erroPadrao);
    }
}
