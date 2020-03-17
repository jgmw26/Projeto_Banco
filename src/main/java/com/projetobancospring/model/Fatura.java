package com.projetobancospring.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Fatura {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_Fatura;
	
	@NotNull
	private LocalDate dataVencimento;
	
	@NotNull
	private LocalDate dataPagamento;
	
	@NotNull
	private LocalDate dataFechamento;
	
	@NotNull
	private double valor;
	
	@ManyToOne
	private Cartao cartao;

}
