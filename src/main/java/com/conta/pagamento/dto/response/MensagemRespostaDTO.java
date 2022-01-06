package com.conta.pagamento.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MensagemRespostaDTO {

    private Long id;
    private String mensagem;

    public static MensagemRespostaDTO criaMensagemResposta(String mensagem, Long id){
        MensagemRespostaDTO mensagemRespostaDTO = new MensagemRespostaDTO();
                mensagemRespostaDTO.setMensagem(mensagem + id);
                return mensagemRespostaDTO;
    }

}
