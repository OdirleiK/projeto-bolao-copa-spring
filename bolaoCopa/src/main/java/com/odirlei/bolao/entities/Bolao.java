package com.odirlei.bolao.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_bolao")
public class Bolao implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String descricao;
	private Integer ativo;
	
	
	public Bolao() {}

	public Bolao(Long id, String name, String description) {
		this.id = id;
		this.nome = name;
		this.descricao = description;
	}

	@Column
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String name) {
		this.nome = name;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String description) {
		this.descricao = description;
	}


	public int getAtivo() {
		return  ativo;
	}

	public void setAtivo(int ativo) {
		this.ativo = ativo;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bolao other = (Bolao) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
}
