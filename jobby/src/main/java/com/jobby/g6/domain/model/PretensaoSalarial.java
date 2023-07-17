package com.jobby.g6.domain.model;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Data;

@Data
@Embeddable
public class PretensaoSalarial {
    @Column(nullable = false)
    private Double valorMinimo;

    @Column(nullable = false)
    private Double valorMaximo;
}
