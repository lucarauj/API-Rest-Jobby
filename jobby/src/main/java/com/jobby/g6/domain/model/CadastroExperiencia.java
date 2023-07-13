package com.jobby.g6.domain.model;

import com.jobby.g6.domain.model.enums.RegimeContratacaoEnum;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
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

    @Column(nullable = false)
    private Empresa empresa;


}
