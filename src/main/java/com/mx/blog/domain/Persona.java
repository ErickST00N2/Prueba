package com.mx.blog.domain;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table
//@Data
public class Persona {
	@Id
	private Long idPersona;
	
	@Column(name = "NOMBRE", columnDefinition = "VARCHAR2(100)")
	private String nombre;
	
	@Column(name = "APELLIDOS", columnDefinition = "VARCHAR2(100)")
	private String apellidos;
	
	@Column(name = "SEXO", columnDefinition = "VARCHAR2(100)")
	private String sexo;
	
	@Column(name = "PAIS", columnDefinition = "VARCHAR2(100)")
	private String pais;
	
	@Column(name = "DIRECCION", columnDefinition = "VARCHAR2(100)")
	private String direccion;

	@OneToOne
	@JoinColumn(name = "usuarioId")
	private Usuario usuarioId;

	@OneToMany(mappedBy = "persona")
	private List<Publicacion> publicaciones;

	public Persona() {
		super();
	}

	public Persona(Long idPersona, String nombre, String apellidos, String sexo, String pais, String direccion) {
		super();
		this.idPersona = idPersona;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.sexo = sexo;
		this.pais = pais;
		this.direccion = direccion;
	}

	public Long getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(Long idPersona) {
		this.idPersona = idPersona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

}
