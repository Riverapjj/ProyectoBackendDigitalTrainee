package com.api.videogames.videogamesbackend.controllers;

import com.api.videogames.videogamesbackend.models.entities.Roles;
import com.api.videogames.videogamesbackend.servicios.implementaciones.RolesDAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public void listarPorId(@RequestBody Roles roles){
        rolesServicio.save(roles);
    }

    @PostMapping("/")
    public void guardar(@RequestBody Roles roles){
        rolesServicio.save(roles);
    }

    @PutMapping("/{id}")
    public void actualizar(@RequestBody Roles roles){
        rolesServicio.save(roles);
    }
}