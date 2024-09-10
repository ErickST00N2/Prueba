package com.mx.blog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.blog.domain.Publicacion;
import com.mx.blog.repository.PublicacionRepository;

@Service
public class PublicacionService {
    @Autowired
    private PublicacionRepository publicacionRepository;

    public List<Publicacion> getAllPublicaciones() {
        return publicacionRepository.findAll();
    }

    public Publicacion getPublicacionById(Long id) {
        return publicacionRepository.findById(id).orElse(null);
    }

    public Publicacion createPublicacion(Publicacion publicacion) {
        return publicacionRepository.save(publicacion);
    }
}
