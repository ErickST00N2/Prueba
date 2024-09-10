package com.mx.blog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.blog.domain.Usuario;
import com.mx.blog.repository.UsuarioRepository;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> getAllUsuarios() {
        return usuarioRepository.findAll();
    }

    public Usuario getUsuarioById(Long id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    public Usuario createUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public Usuario updateUsuario(Long id, Usuario usuario) {
        return usuarioRepository.findById(id)
                .map(existingUsuario -> {
                    existingUsuario.setUsuario(usuario.getUsuario());
                    existingUsuario.setContrasenia(usuario.getContrasenia());
                    existingUsuario.setEstado(usuario.getEstado());
                    return usuarioRepository.save(existingUsuario);
                }).orElse(null);
    }

    public void deleteUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }
}
