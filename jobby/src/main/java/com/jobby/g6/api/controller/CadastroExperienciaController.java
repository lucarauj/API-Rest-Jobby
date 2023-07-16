package com.jobby.g6.api.controller;

import com.jobby.g6.api.dto.assemblers.CadastroExperienciaAssembler;
import com.jobby.g6.api.dto.assemblers.CadastroExperienciaDisassembler;
import com.jobby.g6.api.dto.model.CadastroExperienciaModel;
import com.jobby.g6.api.dto.model.input.CadastroExperienciaInput;
import com.jobby.g6.domain.exception.CadastroExperienciaNaoEncontradoException;
import com.jobby.g6.domain.model.CadastroExperiencia;
import com.jobby.g6.domain.service.CadastroExperienciaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cadastros/{cadastroId}/cadastro-experiencias")
public class CadastroExperienciaController {

    @Autowired
    private CadastroExperienciaService cadastroExperienciaService;

    @Autowired
    private CadastroExperienciaAssembler cadastroExperienciaAssembler;

    @Autowired
    private CadastroExperienciaDisassembler cadastroExperienciaDisassembler;

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<CadastroExperienciaModel> listar(@PathVariable Integer cadastroId){
     List<CadastroExperiencia> cadastros = cadastroExperienciaService.buscarTodos();
     return cadastroExperienciaAssembler.toCollectionModel(cadastros);
    }

    @GetMapping("/{cadastroExperienciaId}")
    @ResponseStatus(HttpStatus.OK)
    public CadastroExperienciaModel buscarPorId(@PathVariable Integer cadastroId, @PathVariable Integer cadastroExperienciaId){
        CadastroExperiencia cadastroExperiencia = cadastroExperienciaService.buscar(cadastroExperienciaId);

        return cadastroExperienciaAssembler.toModel(cadastroExperiencia);
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public CadastroExperienciaModel criar(@RequestBody @Valid CadastroExperienciaInput cadastroExperienciaInput){
        try{
            CadastroExperiencia cadastroExperiencia = cadastroExperienciaDisassembler.toDomainObject(cadastroExperienciaInput);
            return cadastroExperienciaAssembler.toModel(cadastroExperienciaService.salvar(cadastroExperiencia));
        }catch (CadastroExperienciaNaoEncontradoException e){
            throw new CadastroExperienciaNaoEncontradoException(e.getMessage());
        }
    }

}
