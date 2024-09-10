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

import com.mx.blog.domain.Persona;
import com.mx.blog.service.PersonaService;

@RestController
@RequestMapping("/api/pe")
@CrossOrigin
public class PersonaController {
    @Autowired
    private PersonaService personaService;

    @GetMapping
    public List<Persona> getAllPersonass() {
        return personaService.getAllPersonas();
    }

    @GetMapping("/{idPersona}")
    public Persona getPersonaByIdd(@PathVariable("idPersona") Long idPersona) {
        return personaService.getPersonaById(idPersona);
    }

    @PostMapping
    public Persona createPersonaa(@RequestBody Persona persona) {
        return personaService.createPersona(persona);
    }

    @PutMapping("/{idPersona}")
    public Persona updatePersonaa(@PathVariable("idPersona") Long idPersona, @RequestBody Persona persona) {
        return personaService.updatePersona(idPersona, persona);
    }

    @DeleteMapping("/{idPersona}")
    public void deletePersonaa(@PathVariable Long idPersona) {
        personaService.deletePersona(idPersona);
    }
}
