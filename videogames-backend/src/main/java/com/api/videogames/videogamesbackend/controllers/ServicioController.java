package com.api.videogames.videogamesbackend.controllers;

import com.api.videogames.videogamesbackend.models.entities.Servicio;
import com.api.videogames.videogamesbackend.servicios.implementaciones.ServicioDAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public void listarPorId(@PathVariable Integer id){
        servicioServicio.findById(id);
    }

    @PostMapping("/")
    public void guardar(@RequestBody Servicio servicio){
        servicioServicio.save(servicio);
    }

    @PutMapping("/{id}")
    public void actualizar(@RequestBody Servicio servicio){
        servicioServicio.save(servicio);
    }
}
