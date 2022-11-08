package com.odirlei.bolao.dto;

import java.time.LocalDateTime;

import com.odirlei.bolao.entities.Jogo;

public class JogoDTO {
	
	private Long id;
	private LocalDateTime data;
	private Long id_time1;
	private Long id_time2;
	private Long id_bolao;
	private Long resultado_IdResultado;
	
	public JogoDTO() {}

	public JogoDTO(Long id, LocalDateTime data, Long id_time1, Long id_time2, Long id_bolao,
			Long resultado_IdResultado) {
		super();
		this.id = id;
		this.data = data;
		this.id_time1 = id_time1;
		this.id_time2 = id_time2;
		this.id_bolao = id_bolao;
		this.resultado_IdResultado = resultado_IdResultado;
	}
	
	public JogoDTO(Jogo entity) {
		this.id = entity.getId();
		this.data = entity.getData();
		this.id_time1 = entity.getId_time1();
		this.id_time2 = entity.getId_time2();
		this.id_bolao = entity.getId_bolao();
		this.resultado_IdResultado = entity.getResultado_IdResultado();
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