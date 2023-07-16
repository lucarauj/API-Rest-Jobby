package com.jobby.g6.api.dto.model.input;

import com.jobby.g6.domain.model.Empresa;
import com.jobby.g6.domain.model.enums.RegimeContratacaoEnum;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class CadastroExperienciaInput {

    @NotNull
    private Double salario;

    @NotNull
    private boolean empregoAtual;

    @NotNull
    private LocalDateTime dataContratacao;

    @NotNull
    private LocalDateTime desligamento;

    @NotNull
    private RegimeContratacaoEnum regimeContratacaoEnum;

    @NotNull(message = "{empresa.obrigatoria}")
    private EmpresaInput empresaInput;
}
