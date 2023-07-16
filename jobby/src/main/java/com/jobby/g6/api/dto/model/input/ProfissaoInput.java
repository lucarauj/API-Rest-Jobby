package com.jobby.g6.api.dto.model.input;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProfissaoInput {
    @NotBlank String nome;
}
