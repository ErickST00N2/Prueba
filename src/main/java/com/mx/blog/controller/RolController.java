package com.mx.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.blog.domain.Rol;
import com.mx.blog.service.RolService;

@RestController
@RequestMapping("/api/r")
@CrossOrigin
public class RolController {
    @Autowired
    private RolService rolService;

    @GetMapping
    public List<Rol> getAllRoless() {
        return rolService.getAllRoles();
    }

    @GetMapping("/{idRol}")
    public Rol getRolByIdd(@PathVariable Long idRol) {
        return rolService.getRolById(idRol);
    }

    @PostMapping
    public Rol createRoll(@RequestBody Rol rol) {
        return rolService.createRol(rol);
    }

    @PutMapping
    public Rol updateRoll(@RequestBody Rol rol) {
        return rolService.updateRol(rol);
    }

    @DeleteMapping("/{idRol}")
    public void deleteRoll(@PathVariable Long idRol) {
        rolService.deleteRol(idRol);
    }
}
