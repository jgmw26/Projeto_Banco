package com.projetobancospring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetobancospring.model.Banco;

public interface BancoRepository extends JpaRepository<Banco, Long> {

}
