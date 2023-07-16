package com.jobby.g6.api.dto.assemblers;

import com.jobby.g6.api.dto.model.input.CadastroInput;
import com.jobby.g6.domain.model.Cadastro;
import com.jobby.g6.domain.model.Profissao;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CadastroDisassembler {

    @Autowired
    private ModelMapper modelMapper;

    public Cadastro toDomainObject(CadastroInput cadastroInput){
        Cadastro cadastro = new Cadastro();
        cadastro.setNome(cadastroInput.getNome());
        cadastro.setCpf(cadastroInput.getCpf());
        cadastro.setDataNascimento(cadastroInput.getDataNascimento());
        cadastro.setTelefone(cadastroInput.getTelefone());
        cadastro.setEmail(cadastroInput.getEmail());
        cadastro.setHabilidades(cadastroInput.getHabilidades());

        Profissao profissao = new Profissao();
        profissao.setId(cadastroInput.getProfissaoInput().getId());
        cadastro.setProfissao(profissao);
        cadastro.setPretensaoSalarial(cadastroInput.getPretensaoSalarial());
        cadastro.setSexoEnum(cadastroInput.getSexoEnum());
        cadastro.setCelular(cadastroInput.getCelular());
        cadastro.setEndereco(cadastroInput.getEndereco());

        return cadastro;
        
    }

    public void copyToDomainObject(CadastroInput cadastroInput, Cadastro cadastro){

        modelMapper.map(cadastroInput, cadastro);
    }

}
