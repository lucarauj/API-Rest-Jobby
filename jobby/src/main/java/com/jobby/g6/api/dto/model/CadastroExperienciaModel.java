package com.jobby.g6.api.dto.model;

import com.jobby.g6.domain.model.Empresa;
import com.jobby.g6.domain.model.enums.RegimeContratacaoEnum;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class CadastroExperienciaModel {

    @EqualsAndHashCode.Include
    private Integer id;

    private Double salario;

    private boolean empregoAtual;

    private LocalDateTime dataContratacao;

    private LocalDateTime desligamento;

    private RegimeContratacaoEnum regimeContratacaoEnum;

    private EmpresaModel empresa;
}
