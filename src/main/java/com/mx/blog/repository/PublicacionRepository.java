package com.mx.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.blog.domain.Publicacion;

public interface PublicacionRepository extends JpaRepository<Publicacion, Long> {
}
