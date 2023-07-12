package com.jobby.g6.domain.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class Endereco {

    private Long cep;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    @ManyToOne
    private Cidade cidade;

}
