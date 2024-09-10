package com.mx.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.blog.domain.Publicacion;
import com.mx.blog.service.PublicacionService;

@RestController
@RequestMapping("/api/p")
@CrossOrigin
public class PublicacionController {
    @Autowired
    private PublicacionService publicacionService;

    @GetMapping
    public List<Publicacion> getAllPublicacioness() {
        return publicacionService.getAllPublicaciones();
    }

    @GetMapping("/{idPublicacion}")
    public Publicacion getPublicacionByIdd(@PathVariable("idPublicacion") Long idPublicacion) {
        return publicacionService.getPublicacionById(idPublicacion);
    }

    @PostMapping
    public Publicacion createPublicacionn(@RequestBody Publicacion publicacion) {
        return publicacionService.createPublicacion(publicacion);
    }
}
