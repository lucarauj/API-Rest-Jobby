package com.jobby.g6.api.dto.input;

import jakarta.validation.constraints.NotNull;

public record ProfissaoInputDTO(
        @NotNull Integer id
) {
}
