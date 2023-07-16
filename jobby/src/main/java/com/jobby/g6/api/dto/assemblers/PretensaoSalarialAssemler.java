package com.jobby.g6.api.dto.assemblers;

import com.jobby.g6.api.dto.model.PretensaoSalarialModel;
import com.jobby.g6.api.dto.model.ProfissaoModel;
import com.jobby.g6.domain.model.PretensaoSalarial;
import com.jobby.g6.domain.model.Profissao;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class PretensaoSalarialAssemler {


    @Autowired
    private ModelMapper modelMapper;
    public PretensaoSalarialModel toModel(PretensaoSalarial pretensaoSalarial){
        return modelMapper.map(pretensaoSalarial, PretensaoSalarialModel.class);
    }

    public List<PretensaoSalarialModel> toCollectionModel(Collection<PretensaoSalarial> pretensoes){
        return pretensoes.stream().map(pretensaoSalarial -> toModel(pretensaoSalarial))
                .collect(Collectors.toList());
    }
}
