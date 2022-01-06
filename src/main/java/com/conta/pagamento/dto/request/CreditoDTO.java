package com.conta.pagamento.dto.request;

import com.conta.pagamento.entity.enun.TipoCredito;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreditoDTO {

    private Long id;

    @NotEmpty
    @Size(min = 3, max = 100)
    private String descricaoCredito;

    @NotEmpty
    private Double valor;

    @NotEmpty
    private TipoCredito tipoCredito;

    private String observacao;

    @NotEmpty
    private String dataCredito;

}
