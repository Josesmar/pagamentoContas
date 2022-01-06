package com.conta.pagamento.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ErroResposta {

    private String mensagem;
    private Date dataCorrente;
    private int codigo;
    private String status;
    private String nomeObjeto;
    private List<ErroPadrao> erros;

    @ResponseStatus(HttpStatus.NOT_FOUND)
    public static class EntityNotFoundException extends RuntimeException{
        private static final long serialVersionUID = 1L;

        public EntityNotFoundException(String message){
            super(message);
        }

    }

    public ErroResposta(Date dataCorrente, String mensagem){
        this.dataCorrente = dataCorrente;
        this.mensagem = mensagem;
    }
}
