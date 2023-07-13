package com.jobby.g6.domain.model;

import com.jobby.g6.domain.model.enums.RegimeContratacaoEnum;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Data;


import java.time.LocalDateTime;

@Entity
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class CadastroExperiencia {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @EqualsAndHashCode.Include
    private Integer id;

    @Column(nullable = false)
    private Double salario;

    @Column(nullable = false)
    private boolean empregoAtual;

    @Column(nullable = false)
    private LocalDateTime dataContratacao;

    @Column(nullable = false)
    private LocalDateTime desligamento;

    @Enumerated(EnumType.STRING)
    private RegimeContratacaoEnum regimeContratacaoEnum;

    @ManyToOne
    @JoinColumn(name = "empresa_id")
    private Empresa empresa;

}
