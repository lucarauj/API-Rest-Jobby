package com.jobby.g6.api.dto.input;

import jakarta.validation.constraints.NotNull;

public record PretensaoSalariaInputlDTO(
        @NotNull Double valorMinimo,
        @NotNull Double valorMaximo
) {
}
