package com.api.videogames.videogamesbackend.controllers;

import com.api.videogames.videogamesbackend.models.entities.Roles;
import com.api.videogames.videogamesbackend.servicios.implementaciones.RolesDAOImpl;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/rol")
public class RolesController {

    @Autowired
    RolesDAOImpl rolesServicio;

    @GetMapping("/")
    public List<Roles> listar(){
        return (List<Roles>) rolesServicio.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Roles> listarPorId(@PathVariable Integer id){
        return rolesServicio.findById(id);
    }

    @PostMapping("/")
    public Roles guardar(@RequestBody Roles roles){
        return rolesServicio.save(roles);
    }

    @PutMapping("/{id}")
    public Roles actualizar(@RequestBody Roles roles){
        return rolesServicio.save(roles);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id){
        rolesServicio.deleteById(id);
    }
}
