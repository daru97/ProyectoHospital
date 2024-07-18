package com.demo.models;

import jakarta.persistence.Entity;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Paciente {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String nombre;
	private String rut;	
	private String sala;
	private String diagnostico;
	
	 public Paciente (int i, String string, String string2, String string3, String string4) {
			this.nombre=string;
			this.rut=string2;
			this.sala = string3;
			this.diagnostico = string4;
		}
	public Paciente() {
			
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public String getSala() {
		return sala;
	}
	public void setSala(String sala) {
		this.sala = sala;
	}
	public String getDiagnostico() {
		return diagnostico;
	}
	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}
	
	

}
