package com.jobby.g6.api.dto.model.input;

import com.jobby.g6.domain.model.Celular;
import com.jobby.g6.domain.model.Endereco;
import com.jobby.g6.domain.model.PretensaoSalarial;
import com.jobby.g6.domain.model.enums.SexoEnum;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class CadastroInput {

    @NotBlank(message = "{nome.obrigatorio}")
    private String nome;

    @NotBlank(message = "{cpf.obrigatorio}")
    @CPF(message = "{cpf.invalido}")
    private String cpf;

    @NotNull
    private LocalDateTime dataNascimento;

    @NotNull
    private Long telefone;

    @NotBlank(message = "{email.obrigatorio}")
    @Email(message = "{email.invalido}")
    private String email;

    private List<String> habilidades;

    @NotNull(message = "{profissao.obrigatoria}")
    private ProfissaoInput profissaoInput;

    @NotNull
    private PretensaoSalarial pretensaoSalarial;

    @NotNull
    private SexoEnum sexoEnum;

    @NotNull(message = "{celular.obrigatorio}")
    private Celular celular;

    @NotNull(message = "{endereco.obrigatorio}")
    private Endereco endereco;

}
