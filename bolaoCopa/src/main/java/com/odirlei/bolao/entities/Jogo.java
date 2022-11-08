package com.odirlei.bolao.entities;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "tb_jogo")
public class Jogo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	@DateTimeFormat(style= "dd-MM-yyyy HH:mm")
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern= "dd-MM-yyyy HH:mm")
	private LocalDateTime data;
	
	@ManyToOne(targetEntity = Time.class, fetch = FetchType.EAGER)
	@JoinColumn(nullable = false, name = "id_time1")
	private Long id_time1;
	
	@ManyToOne(targetEntity = Time.class, fetch = FetchType.EAGER)
	@JoinColumn(nullable = false, name = "id_time2")
	private Long id_time2;
	
	@ManyToOne(targetEntity = Bolao.class, fetch = FetchType.EAGER)
	@JoinColumn(nullable = false, name = "id_bolao")
	private Long id_bolao;
	
	@ManyToOne(targetEntity = Resultado.class, fetch = FetchType.EAGER)
	@JoinColumn(nullable = false, name = "id_idResultado")
	private Long resultado_IdResultado;

	public Jogo() {}

	public Jogo(Long id, LocalDateTime data, Long id_time1, Long id_time2, Long id_bolao, Long resultado_IdResultado) {
		super();
		this.id = id;
		this.data = data;
		this.id_time1 = id_time1;
		this.id_time2 = id_time2;
		this.id_bolao = id_bolao;
		this.resultado_IdResultado = resultado_IdResultado;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public Long getId_time1() {
		return id_time1;
	}

	public void setId_time1(Long id_time1) {
		this.id_time1 = id_time1;
	}

	public Long getId_time2() {
		return id_time2;
	}

	public void setId_time2(Long id_time2) {
		this.id_time2 = id_time2;
	}

	public Long getId_bolao() {
		return id_bolao;
	}

	public void setId_bolao(Long id_bolao) {
		this.id_bolao = id_bolao;
	}

	public Long getResultado_IdResultado() {
		return resultado_IdResultado;
	}

	public void setResultado_IdResultado(Long resultado_IdResultado) {
		this.resultado_IdResultado = resultado_IdResultado;
	}
	
	

	


	
	
	
	
}