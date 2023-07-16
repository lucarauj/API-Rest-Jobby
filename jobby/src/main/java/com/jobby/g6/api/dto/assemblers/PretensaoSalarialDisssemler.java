package com.jobby.g6.api.dto.assemblers;

import com.jobby.g6.api.dto.model.CadastroModel;
import com.jobby.g6.api.dto.model.PretensaoSalarialModel;
import com.jobby.g6.api.dto.model.input.CadastroInput;
import com.jobby.g6.api.dto.model.input.PretensaoSalarialInput;
import com.jobby.g6.domain.model.Cadastro;
import com.jobby.g6.domain.model.PretensaoSalarial;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class PretensaoSalarialDisssemler {

    @Autowired
    private ModelMapper modelMapper;

    public PretensaoSalarial toDomainObject(PretensaoSalarialInput pretensaoSalarialInput){
        return modelMapper.map(pretensaoSalarialInput, PretensaoSalarial.class);
    }
}
