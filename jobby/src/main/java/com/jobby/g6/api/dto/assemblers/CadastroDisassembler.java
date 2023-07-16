package com.jobby.g6.api.dto.assemblers;

import com.jobby.g6.api.dto.model.input.CadastroInput;
import com.jobby.g6.domain.model.Cadastro;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CadastroDisassembler {

    @Autowired
    private ModelMapper modelMapper;

    public Cadastro toDomainObject(CadastroInput cadastroInput){
        return modelMapper.map(cadastroInput, Cadastro.class);
    }

}
