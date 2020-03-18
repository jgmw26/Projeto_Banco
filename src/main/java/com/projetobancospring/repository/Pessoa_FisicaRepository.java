package com.projetobancospring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetobancospring.model.PessoaFisica;

public interface Pessoa_FisicaRepository extends JpaRepository<PessoaFisica, Long> {

}
