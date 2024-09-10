package com.mx.blog.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table
@Data
public class Rol {
	@Id
	@Column(name = "ID_ROL", columnDefinition = "NUMBER")
	private Long idRol;
	@Column(name = "TIPO", columnDefinition = "VARCHAR2(100)")
	private String tipo;

	public Rol() {
		super();
	}

	public Rol(Long idRol, String tipo) {
		super();
		this.idRol = idRol;
		this.tipo = tipo;
	}

	public Long getIdRol() {
		return idRol;
	}

	public void setIdRol(Long idRol) {
		this.idRol = idRol;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	

}
