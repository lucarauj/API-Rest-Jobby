package com.jobby.g6.api.dto.input;

import jakarta.validation.constraints.NotBlank;

public record EmpresaInputDTO(
        @NotBlank String nome
) {
}
