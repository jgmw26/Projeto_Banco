package com.projetobancospring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetobancospring.model.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Long> {

}
