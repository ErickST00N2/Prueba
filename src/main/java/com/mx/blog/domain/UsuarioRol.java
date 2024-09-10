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
@Table
@Data
public class UsuarioRol {
    @Id
    
    private Long idUsuarioRol;

    @ManyToOne
    @JoinColumn(name = "usuario")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "idRol")
    private Rol rol;

    
    
    
	public UsuarioRol() {
		super();
	}




	public UsuarioRol(Long idUsuarioRol) {
		super();
		this.idUsuarioRol = idUsuarioRol;
	}




	public Long getIdUsuarioRol() {
		return idUsuarioRol;
	}




	public void setIdUsuarioRol(Long idUsuarioRol) {
		this.idUsuarioRol = idUsuarioRol;
	}
    
    
}
