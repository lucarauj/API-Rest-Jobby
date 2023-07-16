package com.jobby.g6.domain.service;

import com.jobby.g6.domain.exception.CadastroExperienciaNaoEncontradoException;
import com.jobby.g6.domain.exception.CadastroNaoEncontradoException;
import com.jobby.g6.domain.model.CadastroExperiencia;
import com.jobby.g6.domain.repository.CadastroExperienciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CadastroExperienciaService {

    @Autowired
    private CadastroExperienciaRepository cadastroExperienciaRepository;

    public List<CadastroExperiencia> buscarTodos(){
        return cadastroExperienciaRepository.findAll();
    }

    public CadastroExperiencia buscar(Integer cadastroExperienciaId){
        return cadastroExperienciaRepository.findById(cadastroExperienciaId)
                .orElseThrow(() -> new CadastroExperienciaNaoEncontradoException(cadastroExperienciaId));
    }

    @Transactional
    public CadastroExperiencia salvar(CadastroExperiencia cadastroExperiencia){
        return cadastroExperienciaRepository.save(cadastroExperiencia);
    }

    @Transactional
    public void deletar(Integer cadastroExperienciaId){
        try{
            cadastroExperienciaRepository.deleteById(cadastroExperienciaId);
            cadastroExperienciaRepository.flush();
        }catch (EmptyResultDataAccessException e){
            throw new CadastroNaoEncontradoException(cadastroExperienciaId);
        }
    }
}
