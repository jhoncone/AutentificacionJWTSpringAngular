package com.example.clase.security.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity


public class Usuario {

	@Id
    @Column(name="EMPLOYEEID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int employeeid;
	 @NotNull
	private int dni;
	 @NotNull
	//private String firstname;
	 private String nombreUsuario;
	 @NotNull
	private String lastname;
	 @NotNull
	private String email;
	 @NotNull
	private int phone;
	 @NotNull
	private int jobid;
	 @NotNull
	private String passwords;
	  @NotNull
	  /*
	    @ManyToMany(fetch = FetchType.EAGER)
	    @JoinTable(name = "usuario_rol", joinColumns = @JoinColumn(name = "usuario_jobid"),
	    inverseJoinColumns = @JoinColumn(name = "rol_jobid"))
	*/
	    @ManyToMany(fetch = FetchType.EAGER)
	    @JoinTable(name = "usuario_rol", joinColumns = @JoinColumn(name = "usuario_employeeid"),
	    inverseJoinColumns = @JoinColumn(name = "rol_jobid"))
    private Set<Rol> roles =new HashSet<>();
	 
    public Usuario() {
    	
    }

	public Usuario(@NotNull int dni,@NotNull String nombreUsuario,@NotNull String lastname,@NotNull String email,@NotNull int phone,@NotNull int jobid,@NotNull String passwords) {
		super();
		this.dni = dni;
		//this.firstname = firstname;
		this.nombreUsuario=nombreUsuario;
		this.lastname = lastname;
		this.email = email;
		this.phone = phone;
		this.jobid = jobid;
		this.passwords = passwords;
	}


	public int getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}
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

	public String getLastname() {
		return lastname;
	}



	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public int getJobid() {
		return jobid;
	}

	public void setJobid(int jobid) {
		this.jobid = jobid;
	}

	public String getPasswords() {
		return passwords;
	}

	public void setPasswords(String passwords) {
		this.passwords = passwords;
	}

	public Set<Rol> getRoles() {
		return roles;
	}

	public void setRoles(Set<Rol> roles) {
		this.roles = roles;
	}
    
	
}
