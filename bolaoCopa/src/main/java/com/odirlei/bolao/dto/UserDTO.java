package com.odirlei.bolao.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import com.odirlei.bolao.entities.User;

public class UserDTO implements Serializable {
	private static final long serialVersionUID = 1L; 

	private Long id;
	
	@NotBlank
	private String nome;
	
	@NotBlank
	private String sobrenome;
	
	@Email
	private String email;
	
	Set<RoleDTO> roles = new HashSet<>();
	
	public UserDTO() {}

	public UserDTO(Long id, String nome, String sobrenome, String email) {
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
	}
	
	public UserDTO(User entity) {
		id = entity.getId();
		nome = entity.getNome();
		sobrenome = entity.getSobrenome();
		email = entity.getEmail();
		entity.getRoles().forEach(role -> this.roles.add(new RoleDTO(role)));
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

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<RoleDTO> getRoles() {
		return roles;
	}
	
	
	
	
}
