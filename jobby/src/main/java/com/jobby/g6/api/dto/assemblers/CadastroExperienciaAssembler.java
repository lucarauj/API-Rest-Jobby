package com.jobby.g6.api.dto.assemblers;

import com.jobby.g6.api.dto.model.CadastroExperienciaModel;
import com.jobby.g6.domain.model.CadastroExperiencia;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CadastroExperienciaAssembler {

    @Autowired
    private ModelMapper modelMapper;

    public CadastroExperienciaModel toModel(CadastroExperiencia cadastroExperiencia) {

        return modelMapper.map(cadastroExperiencia, CadastroExperienciaModel.class);
    }

    public List<CadastroExperienciaModel> toCollectionModel(Collection<CadastroExperiencia> cadastroExperiencias){
        return cadastroExperiencias.stream().map(cadastroExperiencia -> toModel(cadastroExperiencia))
                .collect(Collectors.toList());
    }
}
