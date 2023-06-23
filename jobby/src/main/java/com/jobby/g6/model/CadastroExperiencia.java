package com.jobby.g6.model;

import com.jobby.g6.enums.RegimeContratacaoEnum;

import java.time.LocalDateTime;

public class CadastroExperiencia {

    private Integer id;
    private Double salario;
    private boolean empregoAtual;
    private LocalDateTime dataContratacao;
    private LocalDateTime desligamento;

    //////////////////////////////////////

    private RegimeContratacaoEnum regimeContratacaoEnum;
    private Empresa empresa;


}
