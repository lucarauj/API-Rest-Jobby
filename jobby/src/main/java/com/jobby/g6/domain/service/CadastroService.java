package com.jobby.g6.domain.service;

import com.jobby.g6.domain.model.Cadastro;
import com.jobby.g6.domain.repository.CadastroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CadastroService{

    @Autowired
    private CadastroRepository cadastroRepository;

    public Cadastro salvar(Cadastro cadastro) {return cadastroRepository.save(cadastro);}

    public void deletar(Integer cadastroId){}

//    public Cadastro atualizar(Integer cadastroId){ return cadastroRepository.save(cadastroId);}

    public Cadastro buscar(Integer cadastroId){
        return cadastroRepository.findById(cadastroId)
                .orElseThrow(RuntimeException::new);
    }
}
