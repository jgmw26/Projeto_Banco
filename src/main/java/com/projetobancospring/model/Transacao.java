package com.projetobancospring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Transacao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_transacao;
	
	@NotNull
	private double valor;
	
	@NotNull
	private DescricaoTransacao descricao;
	
	@NotNull
	@ManyToOne
	private Conta conta;
	
}
