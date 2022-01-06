package com.conta.pagamento.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErroPadrao implements Serializable {

    private Instant timestamp;
    private Integer status;
    private String erro;
    private String mensagem;
    private String path;

}
