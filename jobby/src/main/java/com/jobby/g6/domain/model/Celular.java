package com.jobby.g6.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;


@Embeddable
@Data
public class Celular {

    @Column(nullable = false)
    private Long contato;

    @Column(nullable = false)
    private boolean whatsapp;
}
