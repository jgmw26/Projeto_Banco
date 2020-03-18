package com.projetobancospring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetobancospring.model.Transacao;

public interface TransacaRepository extends JpaRepository<Transacao, Long> {

}
