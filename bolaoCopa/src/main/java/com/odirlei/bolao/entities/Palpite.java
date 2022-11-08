package com.odirlei.bolao.entities;

import java.io.Serializable;
import java.time.LocalDateTime;

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
@Table(name = "tb_palpite")
public class Palpite implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@ManyToOne(targetEntity = Jogo.class, fetch = FetchType.EAGER)
	@JoinColumn(nullable = false, name = "jogo_id")
	private Long jogo_id;
	
	@ManyToOne(targetEntity = User.class, fetch = FetchType.EAGER)
	@JoinColumn(nullable = false, name = "usuario_id")
	private User usuario_id;
	
	@DateTimeFormat(style= "dd-MM-yyyy HH:mm")
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern= "dd-MM-yyyy HH:mm")
	private LocalDateTime data_inclusao;
	
	@ManyToOne(targetEntity = Resultado.class, fetch = FetchType.EAGER)
	@JoinColumn(nullable = false, name = "id_idResultado")
	private Long resultado_IdResultado;

	public Palpite() {}
	
	public Palpite(Long id, Long jogo_id, User usuario_id, LocalDateTime data_inclusao, Long resultado_IdResultado) {
		super();
		this.id = id;
		this.jogo_id = jogo_id;
		this.usuario_id = usuario_id;
		this.data_inclusao = data_inclusao;
		this.resultado_IdResultado = resultado_IdResultado;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getJogo_id() {
		return jogo_id;
	}

	public void setJogo_id(Long jogo_id) {
		this.jogo_id = jogo_id;
	}

	public User getUsuario_id() {
		return usuario_id;
	}

	public void setUsuario_id(User usuario_id) {
		this.usuario_id = usuario_id;
	}

	public LocalDateTime getData_inclusao() {
		return data_inclusao;
	}

	public void setData_inclusao(LocalDateTime data_inclusao) {
		this.data_inclusao = data_inclusao;
	}

	public Long getResultado_IdResultado() {
		return resultado_IdResultado;
	}

	public void setResultado_IdResultado(Long resultado_IdResultado) {
		this.resultado_IdResultado = resultado_IdResultado;
	}
	

	

}
