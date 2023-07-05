package com.devsuperior.demo.dto;

import java.util.HashSet;
import java.util.Set;

import com.devsuperior.demo.entities.User;

public class UserDTO {

	private Long id;
	private String email;
	private String password;
	
	Set<RoleDTO> roles = new HashSet<>();
	
	public UserDTO(Long id, String email, String password) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
	}
	
	public UserDTO(User entity) {
		super();
		id = entity.getId();
		email = entity.getEmail();
		password = entity.getPassword();
		entity.getRoles().forEach(role -> this.roles.add(new RoleDTO(role)));
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<RoleDTO> getRoles() {
		return roles;
	}
}
