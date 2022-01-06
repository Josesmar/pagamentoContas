package com.conta.pagamento.entity;

import com.conta.pagamento.entity.enun.TipoConta;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "conta")
public class Conta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nomeConta;

    @Column(nullable = false)
    private Double valor;

    @Column(nullable = false)
    private Date dataVencimento;

    @Column(nullable = false)
    private TipoConta tipoConta;

}
