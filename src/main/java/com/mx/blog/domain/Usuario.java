package com.mx.blog.domain;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table
//@Data
public class Usuario {
    @Id
    
    private Long idUsuario;

    private String usuario;
    private String contrasenia;
    private String estado;

    @OneToOne(mappedBy = "usuarioId")
    private Persona persona;

    @OneToMany(mappedBy = "usuario")
    private List<UsuarioRol> roles;

	public Usuario() {
		super();
	}

	public Usuario(Long idUsuario, String usuario, String contrasenia, String estado) {
		super();
		this.idUsuario = idUsuario;
		this.usuario = usuario;
		this.contrasenia = contrasenia;
		this.estado = estado;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	


	
   
    
}
