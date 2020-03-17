package com.projetobancospring.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Banco {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_banco;
	
	@NotNull
	private String cnpj;
	
	@NotNull
	private int numero_banco;
	
	@NotNull
	private String razao_social;
	
	@OneToMany(mappedBy = "banco")
	private List<Agencia> agencias = new ArrayList<>();
	
}
