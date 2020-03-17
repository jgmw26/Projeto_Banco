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
public class PessoaJuridica {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_PessoaJuridica;
	
	@NotNull
	@Size(min = 10, max = 100)
	private String razaoSocial;
	
	@NotNull
	@Size(min = 18, max = 18)
	private String cnpj;
	
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
