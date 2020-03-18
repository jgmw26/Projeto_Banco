package com.projetobancospring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetobancospring.model.Cartao;

public interface CartaoRepository extends JpaRepository<Cartao, Long> {

}
