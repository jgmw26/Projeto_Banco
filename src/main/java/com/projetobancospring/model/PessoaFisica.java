package com.projetobancospring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class PessoaFisica {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_PessoaFisica;
	
	@NotNull
	@Size(min = 10, max = 50)
	private String nome;
	
	@NotNull
	@Size(min = 11, max = 11)
	private String cpf;
	
	@NotNull
	@OneToOne
	private Conta conta;
	
	@NotNull
	@OneToOne
	private Cliente cliente;
	
	@NotNull
	@OneToOne
	private Cartao cartao;
}
