package com.jobby.g6.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class PretensaoSalarial {

    @Column(nullable = false)
    private Double valorMinimo;

    @Column(nullable = false)
    private Double valorMaximo;
}
