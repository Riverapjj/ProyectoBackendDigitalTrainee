package com.api.videogames.videogamesbackend.controllers;

import com.api.videogames.videogamesbackend.models.entities.Plataforma;
import com.api.videogames.videogamesbackend.servicios.implementaciones.PlataformaDAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/plataforma")
public class PlataformaController {
    @Autowired
    PlataformaDAOImpl plataformaServicio;

    @GetMapping("/")
    public List<Plataforma> listar(){
        return (List<Plataforma>) plataformaServicio.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Plataforma> listarPorId(@PathVariable Integer id){
        return plataformaServicio.findById(id);
    }

    @PostMapping("/")
    public Plataforma guardar(@RequestBody Plataforma plataforma){
       return plataformaServicio.save(plataforma);
    }

    @PutMapping("/{id}")
    public Plataforma actualizar(@RequestBody Plataforma plataforma){
        return plataformaServicio.save(plataforma);
    }
}
