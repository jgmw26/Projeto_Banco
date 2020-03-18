package com.projetobancospring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.projetobancospring.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

	
}
