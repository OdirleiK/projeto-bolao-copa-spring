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
@Table(name = "tb_resultado")
public class Resultado implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_resultado;
	private String descricao;
	
	public Resultado() {}

	public Resultado(Integer idResultado, String descricao) {
		this.id_resultado = idResultado;
		this.descricao = descricao;
	}

	@Column
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

	@Override
	public int hashCode() {
		return Objects.hash(descricao, id_resultado);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Resultado other = (Resultado) obj;
		return Objects.equals(descricao, other.descricao) && Objects.equals(id_resultado, other.id_resultado);
	}
	
	
	
	

	
}
