package com.odirlei.bolao.entities;

import java.io.Serializable;
import java.util.Objects;

public class Bolao implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private String description;
	
	public Bolao() {}

	public Bolao(Long id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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