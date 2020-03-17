package com.projetobancospring.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;


import lombok.Data;

@Data
@Entity
public class Agencia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_agencia;
	
	@NotNull
	private int numero_agencia;
	
	@NotNull
	@ManyToOne
	private Banco banco;
	
	@NotNull
	@OneToOne
	private Endereco endereco;
	
	@OneToMany(mappedBy = "agencia")
	private List<Conta> contas = new ArrayList<>();
}
