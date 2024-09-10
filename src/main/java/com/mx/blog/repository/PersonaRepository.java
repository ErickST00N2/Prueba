package com.mx.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.blog.domain.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
}
