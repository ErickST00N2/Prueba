package com.mx.blog.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table
public class Publicacion {
	@Id
	private Long idPublicacion;

	@ManyToOne
	@JoinColumn(name = "idPersona")
	private Persona persona;

	private String cuerpo;

	public Publicacion() {
		super();
	}

	public Publicacion(Long idPublicacion, String cuerpo) {
		super();
		this.idPublicacion = idPublicacion;
		this.cuerpo = cuerpo;
	}

	public Long getIdPublicacion() {
		return idPublicacion;
	}

	public void setIdPublicacion(Long idPublicacion) {
		this.idPublicacion = idPublicacion;
	}

	public String getCuerpo() {
		return cuerpo;
	}

	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}

}
