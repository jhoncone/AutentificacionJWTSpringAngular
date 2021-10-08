package com.example.clase.security.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.example.clase.security.enums.RolNombre;
@Entity

public class Rol {
     @Id
     @Column(name="JOBID")
     @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int jobid;
     @Enumerated(EnumType.STRING)
	private RolNombre rolNombre;
    //private double salary;
     
     public Rol() {
    	 
     }

	public Rol(RolNombre rolNombre) {
		super();
		this.rolNombre = rolNombre;
		//this.salary=salary;
	}


	public int getJobid() {
		return jobid;
	}

	public void setJobid(int jobid) {
		this.jobid = jobid;
	}

	public RolNombre getRolNombre() {
		return rolNombre;
	}

	public void setRolNombre(RolNombre rolNombre) {
		this.rolNombre = rolNombre;
	}
/*
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
    */ 
     
}
