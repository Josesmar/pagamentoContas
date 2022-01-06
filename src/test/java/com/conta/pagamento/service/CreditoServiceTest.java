//package com.conta.pagamento.service;
//
//import com.conta.pagamento.dto.mapper.CreditoMapper;
//import com.conta.pagamento.dto.request.CreditoDTO;
//import com.conta.pagamento.dto.response.MensagemRespostaDTO;
//import com.conta.pagamento.entity.Credito;
//import com.conta.pagamento.repository.CreditoRepository;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//
//import java.text.ParseException;
//
//import static com.conta.pagamento.entitymock.CreditoMock.criaFakeDTO;
//import static com.conta.pagamento.entitymock.CreditoMock.criarFakeEntity;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.Mockito.when;
//
//@ExtendWith(MockitoExtension.class)
//public class CreditoServiceTest {
//
//    @Mock
//    private CreditoRepository creditoRepository;
//
//    @Mock
//    private CreditoMapper creditoMapper;
//
//    @InjectMocks
//    private CreditoService creditoService;
//
//    @Test
//    void deveRetornarMensagemSucesso() throws ParseException {
//        CreditoDTO creditoDTO = criaFakeDTO();
//        Credito expectivativaCreditoSalvo = criarFakeEntity();
//
//        when(creditoMapper.converteParaModel(creditoDTO)).thenReturn(expectivativaCreditoSalvo);
//        when(creditoRepository.save(any(Credito.class))).thenReturn(expectivativaCreditoSalvo);
//
//        MensagemRespostaDTO expectivativaMensagemSucesso = criarMensagemSucessoEsperada(expectivativaCreditoSalvo.getId());
//        MensagemRespostaDTO mensagemSucesso = creditoService.create(creditoDTO);
//
//        assertEquals(expectivativaMensagemSucesso, mensagemSucesso);
//    }
//
//   private MensagemRespostaDTO criarMensagemSucessoEsperada(Long creditoId){
//        return MensagemRespostaDTO.builder()
//                .mensagem("Crédito incluido com sucesso, Id: " + creditoId)
//                .build();
//   }
//
//
//
//}