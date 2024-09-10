package com.mx.blog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.mx.blog.domain.Persona;
import com.mx.blog.repository.PersonaRepository;

@Service
public class PersonaService {
    @Autowired
    private PersonaRepository personaRepository;

    public List<Persona> getAllPersonas() {
        return personaRepository.findAll(Sort.by(Sort.Direction.ASC, "idPersona"));
    }

    public Persona getPersonaById(Long id) {
        return personaRepository.findById(id).orElse(null);
    }

    public Persona createPersona(Persona persona) {
        return personaRepository.save(persona);
    }

    public Persona updatePersona(Long id, Persona persona) {
        return personaRepository.findById(id)
                .map(existingPersona -> {
                    existingPersona.setNombre(persona.getNombre());
                    existingPersona.setApellidos(persona.getApellidos());
                    existingPersona.setSexo(persona.getSexo());
                    existingPersona.setPais(persona.getPais());
                    existingPersona.setDireccion(persona.getDireccion());
                    return personaRepository.save(existingPersona);
                }).orElse(null);
    }

    public void deletePersona(Long id) {
        personaRepository.deleteById(id);
    }
}
