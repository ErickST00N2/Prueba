package com.mx.blog.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.blog.domain.Rol;

public interface RolRepository extends JpaRepository<Rol, Long> {
    public List<Rol> findByIdRol(Long idRol);

}
