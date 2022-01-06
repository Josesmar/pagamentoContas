package com.conta.pagamento.controller;

import com.conta.pagamento.dto.response.MensagemRespostaDTO;
import com.conta.pagamento.entity.Credito;
import com.conta.pagamento.exceptions.ResourceNotFoundException;
import com.conta.pagamento.service.CreditoService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

//@RestController @CrossOrigin(origins = "http://localhost:4200/contasAPagar")
@RestController
@RequestMapping (value = "/api/creditos")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class CreditoController {

    @Autowired
    private CreditoService creditoService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MensagemRespostaDTO create(@RequestBody @Valid Credito credito){
        return creditoService.create(credito);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Credito findById(@PathVariable Long id) throws ResourceNotFoundException {
        return creditoService.findById(id);
    }

    @GetMapping
    public List<Credito> listarTodos(){
        return creditoService.listAll();
    }

    @PutMapping(path = "/{id}")
    public MensagemRespostaDTO updateById(@PathVariable Long id, @RequestBody @Valid Credito credito) throws ResourceNotFoundException {
        return creditoService.updateById(id, credito);
    }
}
