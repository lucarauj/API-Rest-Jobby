package com.jobby.g6.domain.repository;

import com.jobby.g6.domain.model.Cadastro;
import com.jobby.g6.domain.model.Profissao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfissaoRepository extends JpaRepository<Profissao, Integer> {
}
