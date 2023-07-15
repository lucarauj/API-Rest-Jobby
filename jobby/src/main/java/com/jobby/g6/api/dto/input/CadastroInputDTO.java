package com.jobby.g6.api.dto.input;

import com.jobby.g6.domain.model.*;
import com.jobby.g6.domain.model.enums.SexoEnum;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDateTime;
import java.util.List;

public record CadastroInputDTO(
        @NotBlank(message = "{nome.obrigatorio}")
        String nome,
        @NotBlank(message = "{cpf.obrigatorio}")
        @CPF(message = "{cpf.invalido}")
        String cpf,
        @NotNull LocalDateTime dataNascimento,
        @NotNull Long telefone,
        @NotBlank(message = "{email.obrigatorio}")
        @Email(message = "{email.invalido}")
        String email,
        @NotBlank List<String> habilidades,
        @NotNull(message = "profissao obrigatoria") ProfissaoInputDTO profissao,
        @NotNull(message = "pretensao obrigatoria") PretensaoSalariaInputlDTO pretensaoSalarial,
        @NotNull SexoEnum sexoEnum,
        @NotNull(message = "{celular.obrigatorio}") Celular celular,
        @NotNull(message = "{endereco.obrigatorio}") Endereco endereco,
        List<CadastroExperienciaInputDTO> cadastroExperiencia
) {
}
