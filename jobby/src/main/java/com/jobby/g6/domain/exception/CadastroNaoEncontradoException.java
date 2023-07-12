package com.jobby.g6.domain.exception;

public class CadastroNaoEncontradoException extends EntidadeNaoEncontradaException{
    private static final long serialVersionUID = 1L;

    public CadastroNaoEncontradoException(String mensagem){
        super(mensagem);
    }

    public CadastroNaoEncontradoException(Integer cadastroId){
        super(String.format("Não existe um cadastro para o código %d", cadastroId));
    }
}
