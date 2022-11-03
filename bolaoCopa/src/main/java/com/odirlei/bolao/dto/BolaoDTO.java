package com.odirlei.bolao.dto;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.odirlei.bolao.entities.Bolao;

public class BolaoDTO implements Serializable {
	private static final long serialVersionUID = 1L; 

	private Long id;
	
	@Size(min = 5)
	@NotBlank
	private String nome;
	
	@Size(min = 5)
	@NotBlank
	private String descricao;
	private Integer ativo;
	
	public BolaoDTO() {}

	public BolaoDTO(Long id, String nome, String descricao, int ativo) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.ativo = ativo;
	}
	
	public BolaoDTO(Bolao entity) {
		this.id = entity.getId();
		this.nome = entity.getNome();
		this.descricao = entity.getDescricao();
		this.ativo = entity.getAtivo();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getAtivo() {
		return ativo;
	}

	public void setAtivo(int ativo) {
		this.ativo = ativo;
	}
	
	
	
	
}
