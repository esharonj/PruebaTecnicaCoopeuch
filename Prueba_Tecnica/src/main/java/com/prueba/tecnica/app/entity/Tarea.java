package com.prueba.tecnica.app.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tarea")
public class Tarea implements Serializable{

	private static final long serialVersionUID = 6889291274717838860L;


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int identificador;
	
	
	@Column(length = 80, nullable = false)
	private String descripcion;
	
	@Column(nullable = false)
	private Date fechaCreacion;
	
	@Column(nullable = false)
	private boolean vigente;

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public String getDescripcion() { 
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public boolean isVigente() {
		return vigente;
	}

	public void setVigente(boolean vigente) {
		this.vigente = vigente;
	}

	
	
}
