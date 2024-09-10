package com.mx.blog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.mx.blog.domain.Rol;
import com.mx.blog.repository.RolRepository;

@Service
public class RolService {
    @Autowired
    private RolRepository repo;

    public List<Rol> getAllRoles() {
        return repo.findAll(Sort.by(Sort.Direction.ASC, "idRol"));
    }

    public Rol getRolById(Long idRol) {
        return repo.findByIdRol(idRol).get(0);
    }

    public Rol createRol(Rol rol) {
        return repo.save(rol);
    }
    
    public Rol updateRol(Rol rol) {
     repo.save(rol);
     
     return rol;
    }

    public void deleteRol(Long idRol) {
    	repo.deleteById(idRol);
    }
}
