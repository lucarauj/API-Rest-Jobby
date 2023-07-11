package com.jobby.g6.domain.model;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Cidade {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @EqualsAndHashCode.Include
    private Integer id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String estado;

    @Column(nullable = false)
    private String sigla;
}
