package com.projetobancospring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetobancospring.model.Fatura;

public interface FaturaRepository extends JpaRepository<Fatura, Long> {

}