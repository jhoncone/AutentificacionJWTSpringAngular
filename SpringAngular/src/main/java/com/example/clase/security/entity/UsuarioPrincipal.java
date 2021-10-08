package com.example.clase.security.entity;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class UsuarioPrincipal implements UserDetails{
	private int dni;
	//private String firstname;
	private String nombreUsuario;
	private String lastname;
	private String email;
	private int phone;
	private int jobid;
	private String passwords;
	
	private Collection<? extends GrantedAuthority> authorities;

	
	
	public UsuarioPrincipal(int dni, String nombreUsuario, String lastname, String email, int phone, int jobid,
			String passwords, Collection<? extends GrantedAuthority> authorities) {
		super();
		this.dni = dni;
		//this.firstname = firstname;
		this.nombreUsuario=nombreUsuario;
		this.lastname = lastname;
		this.email = email;
		this.phone = phone;
		this.jobid = jobid;
		this.passwords = passwords;
		this.authorities = authorities;
	}
	
	public static UsuarioPrincipal build(Usuario usuario) {
		List<GrantedAuthority> authorities=
				usuario.getRoles().stream().map(rol-> new SimpleGrantedAuthority(rol
						.getRolNombre().name())).collect(Collectors.toList());
	return new UsuarioPrincipal(usuario.getDni(),usuario.getNombreUsuario(),usuario.getEmail(),usuario.getLastname(),usuario.getJobid(),usuario.getPhone(),usuario.getPasswords(),authorities);
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return authorities;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return passwords;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		//return firstname;
		return nombreUsuario;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

	public int getDni() {
		return dni;
	}


	public String getLastname() {
		return lastname;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public void setPhone(int phone) {
		this.phone = phone;
	}

	public int getJobid() {
		return jobid;
	}


	
}
