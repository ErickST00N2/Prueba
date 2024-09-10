package com.mx.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.blog.domain.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
