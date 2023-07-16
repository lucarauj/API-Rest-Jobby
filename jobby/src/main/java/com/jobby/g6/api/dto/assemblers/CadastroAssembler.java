package com.jobby.g6.api.dto.assemblers;

import com.jobby.g6.api.dto.model.CadastroModel;
import com.jobby.g6.domain.model.Cadastro;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CadastroAssembler {

    @Autowired
    private ModelMapper modelMapper;
    public CadastroModel toModel(Cadastro cadastro){
        if (modelMapper.getTypeMap(Cadastro.class, CadastroModel.class) == null) {
            modelMapper.addMappings(new PropertyMap<Cadastro, CadastroModel>() {
                @Override
                protected void configure() {
                    map().setValorMinimo(source.getPretensaoSalarial().getValorMinimo());
                    map().setValorMaximo(source.getPretensaoSalarial().getValorMaximo());
                }

            });
        }
        return modelMapper.map(cadastro, CadastroModel.class);
    }

    public List<CadastroModel> toCollectionModel(Collection<Cadastro> cadastros){
        return cadastros.stream().map(cadastro -> toModel(cadastro))
                .collect(Collectors.toList());
    }
}
