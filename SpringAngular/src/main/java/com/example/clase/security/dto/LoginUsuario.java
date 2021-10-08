package com.example.clase.security.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class LoginUsuario {
	@NotBlank
	//private String firstname;
	private String nombreUsuario;

	@NotBlank
	private String passwords;
/*
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	*/
	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getPasswords() {
		return passwords;
	}



	public void setPasswords(String passwords) {
		this.passwords = passwords;
	}

}
