package com.example.Api.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USUARIO")
public class Usuario {
	@GeneratedValue
	@Id
	@Column(name="ID")
	private long id;
	
	@Column(name="USUARIO")
	private String usuario;
	
	@Column(name="PASSWORD")
	private String password;
	
	@Column(name="ROL")
	private byte rol;
	
	@Column(name="ACTIVO")
	private boolean activo;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public byte getRol() {
		return rol;
	}

	public void setRol(byte rol) {
		this.rol = rol;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}
}
