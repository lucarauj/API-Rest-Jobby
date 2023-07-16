package com.jobby.g6.domain.exception;

public class ProfissaoNaoEncontradoException extends EntidadeNaoEncontradaException{
    private static final long serialVersionUID = 1L;

    public ProfissaoNaoEncontradoException(String mensagem){
        super(mensagem);
    }

    public ProfissaoNaoEncontradoException(Integer profissaoId){
        super(String.format("Não existe uma profissão para o código %d", profissaoId));
    }
}
