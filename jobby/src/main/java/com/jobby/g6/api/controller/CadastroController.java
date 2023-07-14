package com.jobby.g6.api.controller;

import com.jobby.g6.domain.model.Cadastro;
import com.jobby.g6.domain.service.CadastroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cadastros")
public class CadastroController {
    @Autowired
    private CadastroService cadastroService;

    @GetMapping()
    public ResponseEntity<List<Cadastro>> getAllCadastros() {
        return ResponseEntity.status(HttpStatus.OK).body(cadastroService.buscarTodos());
    }
}
