package com.api.videogames.videogamesbackend.controllers;

import com.api.videogames.videogamesbackend.models.entities.Direccion;
import com.api.videogames.videogamesbackend.servicios.implementaciones.DireccionDAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/direccion")
public class DireccionController {
    @Autowired
    DireccionDAOImpl direccionServicio;
    @GetMapping("/")
    public List<Direccion> listar(){
        return (List<Direccion>) direccionServicio.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Direccion> listarPorId(@PathVariable Integer id){
        return direccionServicio.findById(id);
    }

    @PostMapping("/")
    public Direccion guardar(@RequestBody Direccion direccion){
        return direccionServicio.save(direccion);
    }

    @PutMapping("/{id}")
    public Direccion actualizar(@RequestBody Direccion direccion){
        return direccionServicio.save(direccion);
    }
}
