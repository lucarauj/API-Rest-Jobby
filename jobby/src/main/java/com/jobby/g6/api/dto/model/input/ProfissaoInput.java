package com.jobby.g6.api.dto.model.input;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProfissaoInput {
    @NotNull(message = "{id.obrigatorio}")
    Integer id;
}
