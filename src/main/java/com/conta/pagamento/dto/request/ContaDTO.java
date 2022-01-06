package com.conta.pagamento.dto.request;

import com.conta.pagamento.entity.enun.TipoConta;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ContaDTO {

    private Long id;

    @NotEmpty
    private String nomeConta;

    @NotEmpty
    private Double valor;

    @NotEmpty
    private Date dataVencimento;

    @NotEmpty
    private TipoConta tipoConta;

}