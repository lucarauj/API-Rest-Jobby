package com.jobby.g6.api.dto.assemblers;

import com.jobby.g6.api.dto.model.CadastroModel;
import com.jobby.g6.api.dto.model.ProfissaoModel;
import com.jobby.g6.domain.model.Cadastro;
import com.jobby.g6.domain.model.Profissao;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProfissaoAssembler {

    @Autowired
    private ModelMapper modelMapper;
    public ProfissaoModel toModel(Profissao profissao){
        return modelMapper.map(profissao, ProfissaoModel.class);
    }

    public List<ProfissaoModel> toCollectionModel(Collection<Profissao> profissoes){
        return profissoes.stream().map(profissao -> toModel(profissao))
                .collect(Collectors.toList());
    }
}
