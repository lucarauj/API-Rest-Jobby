package com.jobby.g6.domain.model;

import com.jobby.g6.domain.model.enums.SexoEnum;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Data;


import java.time.LocalDateTime;
import java.util.List;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Cadastro {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @EqualsAndHashCode.Include
    private Integer id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String cpf;

    @Column(nullable = false)
    private LocalDateTime dataNascimento;

    @Column(nullable = false)
    private Long telefone;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private List<String> habilidades;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "cadastro_id")
    private List<Profissao> profissao;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "pretensao_salarial_id")
    private PretensaoSalarial pretensaoSalarial;

    @Enumerated(EnumType.STRING)
    private SexoEnum sexoEnum;

    @Embedded
    private Celular celular;

    @Embedded
    private Endereco endereco;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "cadastro_id")
    private List<CadastroExperiencia> cadastroExperiencia;
}
