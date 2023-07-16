package com.jobby.g6.api.dto.assemblers;

import com.jobby.g6.api.dto.model.input.CadastroInput;
import com.jobby.g6.api.dto.model.input.ProfissaoInput;
import com.jobby.g6.domain.model.Cadastro;
import com.jobby.g6.domain.model.Profissao;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProfissaoDisassembler {
    @Autowired
    private ModelMapper modelMapper;

    public Profissao toDomainObject(ProfissaoInput profissaoInput){
        return modelMapper.map(profissaoInput, Profissao.class);
    }
}
