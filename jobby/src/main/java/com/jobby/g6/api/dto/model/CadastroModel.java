package com.jobby.g6.api.dto.model;

import com.jobby.g6.domain.model.Celular;
import com.jobby.g6.domain.model.Endereco;
import com.jobby.g6.domain.model.enums.SexoEnum;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class CadastroModel {
    @EqualsAndHashCode.Include
    private Integer id;

    private String nome;

    private String cpf;

    private LocalDateTime dataNascimento;

    private Long telefone;

    private String email;

    private List<String> habilidades;

    private ProfissaoModel profissao;

    private Double valorMinimo;

    private Double valorMaximo;

    private SexoEnum sexoEnum;

    private Celular celular;

    private Endereco endereco;

    private List<CadastroExperienciaModel> cadastroExperiencia;
}
