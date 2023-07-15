package com.jobby.g6.domain.service;

import com.jobby.g6.api.dto.CadastroDTO;
import com.jobby.g6.domain.exception.CadastroNaoEncontradoException;
import com.jobby.g6.domain.exception.NegocioException;
import com.jobby.g6.domain.model.Cadastro;
import com.jobby.g6.domain.repository.CadastroRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CadastroService{

    @Autowired
    private CadastroRepository cadastroRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Transactional
    public Cadastro salvar(CadastroDTO cadastroDTO) {
        Optional<Cadastro> cadastroExistente = cadastroRepository.findById(cadastro.getId());

        if(cadastroExistente.isPresent() && cadastroExistente.get().equals(cadastro)) {
            throw new NegocioException(
                    String.format("Já existe um cadastro para esse código: %d", cadastroExistente)
            );
        }

        return cadastroRepository.save(cadastro);
    }

    @Transactional
    public void deletar(Integer cadastroId){
        try{
            cadastroRepository.deleteById(cadastroId);
            cadastroRepository.flush();
        }catch (EmptyResultDataAccessException e){
            throw new CadastroNaoEncontradoException(cadastroId);
        }
    }

    @Transactional
    public CadastroDTO atualizar(Integer cadastroId, Cadastro novoCadastro){
        Cadastro cadastroExistente = buscarPorId(cadastroId);

        if(cadastroExistente!=null){
            cadastroExistente.setCpf(novoCadastro.getCpf());
            cadastroExistente.setNome(novoCadastro.getNome());
            cadastroExistente.setDataNascimento(novoCadastro.getDataNascimento());
            cadastroExistente.setTelefone(novoCadastro.getTelefone());
            cadastroExistente.setEmail(novoCadastro.getEmail());
            cadastroExistente.setHabilidades(novoCadastro.getHabilidades());
            cadastroExistente.setProfissao(novoCadastro.getProfissao());
            cadastroExistente.setPretensaoSalarial(novoCadastro.getPretensaoSalarial());
            cadastroExistente.setSexoEnum(novoCadastro.getSexoEnum());
            cadastroExistente.setCelular(novoCadastro.getCelular());
            cadastroExistente.setEndereco(novoCadastro.getEndereco());
            cadastroExistente.setCadastroExperiencia(novoCadastro.getCadastroExperiencia());

            return salvar(cadastroExistente);
        }else{
            throw new CadastroNaoEncontradoException(cadastroId);
        }
    }

    public CadastroDTO buscarPorId(Integer cadastroId){
        return cadastroRepository.findById(cadastroId)
                .orElseThrow(() -> new CadastroNaoEncontradoException(cadastroId));
    }

    public List<CadastroDTO> buscarTodos() {
        return cadastroRepository.findAll();
    }
}
