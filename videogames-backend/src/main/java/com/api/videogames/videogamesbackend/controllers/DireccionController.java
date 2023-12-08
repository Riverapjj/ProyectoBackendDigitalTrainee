package com.api.videogames.videogamesbackend.controllers;

import com.api.videogames.videogamesbackend.models.entities.Direccion;
import com.api.videogames.videogamesbackend.servicios.implementaciones.DireccionDAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public void listarPorId(@PathVariable Integer id){
        direccionServicio.findById(id);
    }

    @PostMapping("/")
    public void guardar(@RequestBody Direccion direccion){
        direccionServicio.save(direccion);
    }

    @PutMapping("/{id}")
    public void actualizar(@RequestBody Direccion direccion){
        direccionServicio.save(direccion);
    }
}
