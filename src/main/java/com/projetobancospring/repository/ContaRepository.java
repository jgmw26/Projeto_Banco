package com.projetobancospring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetobancospring.model.Conta;

public interface ContaRepository extends JpaRepository<Conta, Long> {

}
