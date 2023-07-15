package com.jobby.g6.api.controller;

import com.jobby.g6.api.dto.input.CadastroInputDTO;
import com.jobby.g6.domain.model.Cadastro;
import com.jobby.g6.domain.service.CadastroService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cadastros")
public class CadastroController {
    @Autowired
    private CadastroService cadastroService;

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<Cadastro> listarTodos() {
        return cadastroService.buscarTodos();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Cadastro buscarPorId(@PathVariable Integer id){
        return cadastroService.buscar(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cadastro criar(@RequestBody CadastroInputDTO cadastroInputDTO){
        Cadastro cadastro = new Cadastro();
        BeanUtils.copyProperties(cadastroInputDTO, cadastro);
        return cadastroService.salvar(cadastro);
    }
}
