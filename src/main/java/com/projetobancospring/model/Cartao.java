package com.projetobancospring.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Cartao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_Cartao; 
	
	@NotNull
	private String numeroCartao;
	
	@NotNull
	private LocalDate dataVencimento;
	
	@NotNull
	private LocalDate dataEmissao;
	
	@NotNull
	private int codigoSeguranca;
	
	@NotNull
	@OneToOne
	private Conta conta;
	
	@NotNull
	@OneToOne
	private Agencia agencia;
	
	@OneToMany(mappedBy = "cartao")
	private List<Fatura> faturas = new ArrayList<>();

}
