package com.odirlei.bolao.dto;

import java.io.Serializable;

import com.odirlei.bolao.entities.Resultado;

public class ResultadoDTO implements Serializable {
	private static final long serialVersionUID = 1L; 
	
	private Integer id_resultado;
	private String descricao;
	
	public ResultadoDTO() {}
	
	public ResultadoDTO(Integer idResultado, String descricao) {
		this.id_resultado = idResultado;
		this.descricao = descricao;
	}
	
	public ResultadoDTO(Resultado entity) {
		this.id_resultado = entity.getIdResultado();
		this.descricao = entity.getDescricao();
	}

	public Integer getIdResultado() {
		return id_resultado;
	}

	public void setIdResultado(Integer idResultado) {
		this.id_resultado = idResultado;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
	
}
