package com.jobby.g6.model;

import com.jobby.g6.enums.SexoEnum;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class Cadastro {
    private Integer id;
    private String nome;
    private String cpf;
    private LocalDateTime dataNascimento;
    private Long telefone;
    private String email;
    private List<String> habilidades;
    private Profissao profissao;
    private PretensaoSalarial pretensaoSalarial;
    private SexoEnum sexoEnum;
    private Celular celular;
    private Endereco endereco;
    private CadastroExperiencia cadastroExperiencia;
}
