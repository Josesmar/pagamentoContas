package com.conta.pagamento.entity;

import com.conta.pagamento.entity.enun.TipoCredito;
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
@Table(name = "credito")
public class Credito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String descricaoCredito;

    @Column(nullable = false)
    private Double valor;

    @Column(nullable = false)
    private TipoCredito tipoCredito;

    @Column(nullable = false)
    private String dataCredito;

    @Column(nullable = false)
    private String observacao;

}
