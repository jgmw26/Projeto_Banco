package com.projetobancospring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_cliente;
	
	@NotNull
	@OneToOne
	private Endereco endereco;
	
	@NotNull
	@OneToOne
	private Contato contato;

}
