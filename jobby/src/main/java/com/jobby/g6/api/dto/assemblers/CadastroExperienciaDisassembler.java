package com.jobby.g6.api.dto.assemblers;

import com.jobby.g6.api.dto.model.input.CadastroExperienciaInput;
import com.jobby.g6.domain.model.CadastroExperiencia;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CadastroExperienciaDisassembler {

    @Autowired
    private ModelMapper modelMapper;

    public CadastroExperiencia toDomainObject(CadastroExperienciaInput cadastroExperienciaInput){
        return modelMapper.map(cadastroExperienciaInput,CadastroExperiencia.class);
    }

    public void copyToDomainObject(CadastroExperienciaInput cadastroExperienciaInput, CadastroExperiencia cadastroExperiencia){

        modelMapper.map(cadastroExperienciaInput, cadastroExperiencia);
    }
}
