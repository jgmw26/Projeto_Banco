package com.projetobancospring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotNull;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Endereco {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotNull
	private String logradouro;
	@NotNull
	private int numero;
	@NotNull
	private String bairro;
	@NotNull
	private String cep;
	@NotNull
	private String cidade;
	@NotNull
	private String estado;
	
	private String complemento;

}
