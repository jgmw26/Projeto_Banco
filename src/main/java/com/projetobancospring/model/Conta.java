package com.projetobancospring.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Conta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_conta;
	
	@NotNull
	private String numero_conta;
	
	@NotNull
	@ManyToOne
	private Agencia agencia;
	
	@NotNull
	private double saldo;
	
	@NotNull
	private double credito;
	
	@NotNull
	private TipoConta tipo;
	
	@OneToMany(mappedBy = "conta")
	private List<Transacao> transacoes = new ArrayList<>();
	
	
}
