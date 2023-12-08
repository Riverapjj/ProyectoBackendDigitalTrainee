package com.api.videogames.videogamesbackend.controllers;

import com.api.videogames.videogamesbackend.models.entities.Servicio;
import com.api.videogames.videogamesbackend.servicios.implementaciones.ServicioDAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/servicio")
public class ServicioController {

    @Autowired
    ServicioDAOImpl servicioServicio;

    @GetMapping("/")
    public List<Servicio> listar(){
        return (List<Servicio>) servicioServicio.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Servicio> listarPorId(@PathVariable Integer id){
        return servicioServicio.findById(id);
    }

    @PostMapping("/")
    public Servicio guardar(@RequestBody Servicio servicio){
        return servicioServicio.save(servicio);
    }

    @PutMapping("/{id}")
    public Servicio actualizar(@RequestBody Servicio servicio){
        return servicioServicio.save(servicio);
    }
}
