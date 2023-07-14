package com.jobby.g6.domain.model;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Data;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class PretensaoSalarial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer id;

    @Column(nullable = false)
    private Double valorMinimo;

    @Column(nullable = false)
    private Double valorMaximo;
}
