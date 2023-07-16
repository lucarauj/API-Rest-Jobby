package com.jobby.g6.domain.model;

import com.jobby.g6.domain.model.enums.SexoEnum;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Data;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Cadastro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "profissao_id")
    private Profissao profissao;

    @Embedded
    private PretensaoSalarial pretensaoSalarial;

    @Enumerated(EnumType.STRING)
    private SexoEnum sexoEnum;

    @Embedded
    private Celular celular;

    @Embedded
    private Endereco endereco;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "cadastro_id")
    private List<CadastroExperiencia> cadastroExperiencia;

    public void adicionarExperiencia(CadastroExperiencia cadastroExperiencia) {
        if (cadastroExperiencia != null) {
            if (this.cadastroExperiencia == null) {
                this.cadastroExperiencia = new ArrayList<>();
            }
            cadastroExperiencia.setCadastro(this);
            this.cadastroExperiencia.add(cadastroExperiencia);
        }
    }

}
