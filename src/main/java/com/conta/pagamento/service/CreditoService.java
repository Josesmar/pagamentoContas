package com.conta.pagamento.service;

import com.conta.pagamento.dto.response.MensagemRespostaDTO;
import com.conta.pagamento.entity.Credito;
import com.conta.pagamento.exceptions.ResourceNotFoundException;
import com.conta.pagamento.repository.CreditoRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.conta.pagamento.constants.Constants.REGISTRO_ATUALIZADO_COM_SUCESSO;
import static com.conta.pagamento.constants.Constants.REGISTRO_CRIADO_COM_SUCESSO;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class CreditoService {

    @Autowired
    private CreditoRepository creditoRepository;

    public MensagemRespostaDTO create (Credito credito){
        creditoRepository.save(credito);
        MensagemRespostaDTO mensagemResposta = criaMensagemResposta(REGISTRO_CRIADO_COM_SUCESSO, credito.getId());

        return mensagemResposta;
    }

    public Credito findById(Long id) throws ResourceNotFoundException {
        verificaSeExisteRegistro(id);
        return creditoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(id));

    }

    public List<Credito> listAll(){
        return creditoRepository.findAll();
    }

    public MensagemRespostaDTO updateById(Long id, Credito credito) throws ResourceNotFoundException {
        creditoRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException(id));

        Credito salvarCredito = creditoRepository.save(credito);
        MensagemRespostaDTO mensagemResposta = criaMensagemResposta(REGISTRO_ATUALIZADO_COM_SUCESSO, salvarCredito.getId());

        return mensagemResposta;
    }

    public void delete(Long id) throws ResourceNotFoundException {
        verificaSeExisteRegistro(id);
        creditoRepository.deleteById(id);
    }


    private MensagemRespostaDTO criaMensagemResposta(String mensagem, Long id){
        return MensagemRespostaDTO.builder()
                .mensagem(mensagem + id)
                .build();
    }

    private void verificaSeExisteRegistro(Long id) throws ResourceNotFoundException {
        creditoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(id));
    }
}
