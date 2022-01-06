package com.conta.pagamento.entitymock;

import com.conta.pagamento.dto.request.CreditoDTO;
import com.conta.pagamento.entity.Credito;
import com.conta.pagamento.entity.enun.TipoCredito;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class CreditoMock {

    private static long CREDITO_ID = 1L;
    private static final String DESCRICAO_CREDITO = "Salário do mês";
    private static final Double VALOR = 1000.0;
    private static final TipoCredito TIPO_CREDITO = TipoCredito.SALARIO;
    private static final String DATA_CREDITO = "15/01/2022";
    private static final String OBSERVACAO = "Sem horas extras";


    public static CreditoDTO criaFakeDTO() throws ParseException {

        return CreditoDTO.builder()
                .id(CREDITO_ID)
                .descricaoCredito(DESCRICAO_CREDITO)
                .valor(VALOR)
                .tipoCredito(TIPO_CREDITO)
                .dataCredito(DATA_CREDITO)
                .observacao(OBSERVACAO)
                .build();
    }

    public static Credito criarFakeEntity() throws ParseException {
        return Credito.builder()
                .id(CREDITO_ID)
                .descricaoCredito(DESCRICAO_CREDITO)
                .valor(VALOR)
                .tipoCredito(TIPO_CREDITO)
                .dataCredito(DATA_CREDITO)
                .build();
    }
}
