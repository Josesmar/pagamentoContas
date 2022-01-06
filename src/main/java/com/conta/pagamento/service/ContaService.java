package com.conta.pagamento.service;

import com.conta.pagamento.dto.response.MensagemRespostaDTO;
import com.conta.pagamento.entity.Conta;
import com.conta.pagamento.exceptions.ResourceNotFoundException;
import com.conta.pagamento.repository.ContaRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ContaService {

    @Autowired
    private ContaRepository contaRepository;

    public MensagemRespostaDTO create (Conta conta){
        contaRepository.save(conta);

       return MensagemRespostaDTO.criaMensagemResposta("Conta cadastrada com sucesso. Id ", conta.getId());
    }



    private Conta verificaSeExisteRegistro(Long id) throws ResourceNotFoundException {
        return contaRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException(id));
    }
}
