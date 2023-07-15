package com.jobby.g6.api.dto.input;

import com.jobby.g6.domain.model.enums.RegimeContratacaoEnum;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record CadastroExperienciaInputDTO(
        @NotNull Double salario,
        @NotNull boolean empregoAtual,
        @NotNull LocalDateTime dataContratacao,
        @NotNull LocalDateTime desligamento,
        @NotNull RegimeContratacaoEnum regimeContratacaoEnum,
        @NotNull EmpresaInputDTO empresa
) {
}
