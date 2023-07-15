package com.jobby.g6.api.dto.input;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record EmpresaInputDTO(
        @NotNull Integer id
) {
}
