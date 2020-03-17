package com.projetobancospring.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;

import org.springframework.security.core.GrantedAuthority;

import lombok.Data;

@Data
@Entity
public class Perfil implements GrantedAuthority{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	private String nome;
	
	@ManyToMany
	@JoinTable(name="relacionamentoPerfilUsuario")
	private List<Usuario> usuarios;
	
	@Override
	public String getAuthority() {
		// TODO Auto-generated method stub
		return this.nome;
	}
	
}
