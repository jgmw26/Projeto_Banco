package com.projetobancospring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotNull;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Contato {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_Contato;
	
	@NotNull
	private String email;
	
	@NotNull
	private String telefone;
}
