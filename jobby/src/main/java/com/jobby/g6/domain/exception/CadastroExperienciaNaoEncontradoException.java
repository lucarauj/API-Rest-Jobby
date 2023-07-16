package com.jobby.g6.domain.exception;

public class CadastroExperienciaNaoEncontradoException extends EntidadeNaoEncontradaException{
    private static final long serialVersionUID = 1L;

    public CadastroExperienciaNaoEncontradoException(String mensagem){
        super(mensagem);
    }

    public CadastroExperienciaNaoEncontradoException(Integer cadastroId){
        super(String.format("Não existe um cadastro de Experiência para o código %d", cadastroId));
    }
}
