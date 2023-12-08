package com.api.videogames.videogamesbackend.controllers;

import com.api.videogames.videogamesbackend.models.entities.Usuario;
import com.api.videogames.videogamesbackend.servicios.implementaciones.UsuarioDAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    UsuarioDAOImpl usuarioServicio;

    @GetMapping("/")
    public List<Usuario> listar(){
        return (List<Usuario>) usuarioServicio.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Usuario> listarPorId(@PathVariable Integer id){
        return usuarioServicio.findById(id);
    }

    @PostMapping("/")
    public Usuario guardar(@RequestBody Usuario usuario){
        return usuarioServicio.save(usuario);
    }

    @PutMapping("/{id}")
    public Usuario actualizar(@RequestBody Usuario usuario){
        return usuarioServicio.save(usuario);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id){
        usuarioServicio.deleteById(id);
    }
}
