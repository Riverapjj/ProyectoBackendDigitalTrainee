package com.api.videogames.videogamesbackend.controllers.controllers;

import com.api.videogames.videogamesbackend.models.entities.Usuario;
import com.api.videogames.videogamesbackend.servicios.implementaciones.UsuarioDAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public void listarPorId(@PathVariable Integer id){
        usuarioServicio.findById(id);
    }

    @PostMapping("/")
    public void guardar(@RequestBody Usuario usuario){
        usuarioServicio.save(usuario);
    }

    @PutMapping("/{id}")
    public void actualizar(@RequestBody Usuario usuario){
        usuarioServicio.save(usuario);
    }
}
