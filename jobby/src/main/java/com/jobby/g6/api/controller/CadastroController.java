package com.jobby.g6.api.controller;

import com.jobby.g6.api.dto.CadastroDTO;
import com.jobby.g6.domain.model.Cadastro;
import com.jobby.g6.domain.service.CadastroService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/cadastros")
public class CadastroController {
    @Autowired
    private CadastroService cadastroService;

    @GetMapping()
    public ResponseEntity<List<CadastroDTO>> getAllCadastros() {
        return ResponseEntity.status(HttpStatus.OK).body(cadastroService.buscarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<CadastroDTO> getById(@PathVariable Integer id) {
        return ResponseEntity.status(HttpStatus.OK).body(cadastroService.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<CadastroDTO> create(@Valid @RequestBody CadastroDTO dto, UriComponentsBuilder uriBuilder) {
        var cadastro = cadastroService.salvar(dto);
        URI endereco = uriBuilder.path("cadastros/{id}").buildAndExpand(cadastro.getId()).toUri();
        return ResponseEntity.status(HttpStatus.CREATED).body(cadastro);
    }

    @PutMapping
    public ResponseEntity<CadastroDTO> update(@Valid @RequestBody CadastroDTO dto, @PathVariable Integer id) {
        return ResponseEntity.status(HttpStatus.OK).body(cadastroService.atualizar(id, dto));
    }

    @DeleteMapping
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        cadastroService.deletar(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
