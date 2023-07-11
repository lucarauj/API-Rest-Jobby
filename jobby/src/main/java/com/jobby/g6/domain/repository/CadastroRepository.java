package com.jobby.g6.domain.repository;

import com.jobby.g6.domain.model.Cadastro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CadastroRepository extends JpaRepository<Cadastro, Integer> {
}
