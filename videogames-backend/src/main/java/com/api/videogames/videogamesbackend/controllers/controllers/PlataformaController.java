package com.api.videogames.videogamesbackend.controllers.controllers;

import com.api.videogames.videogamesbackend.models.entities.Plataforma;
import com.api.videogames.videogamesbackend.servicios.implementaciones.PlataformaDAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public void listarPorId(@PathVariable Integer id){
        plataformaServicio.findById(id);
    }

    @PostMapping("/")
    public void guardar(@RequestBody Plataforma plataforma){
        plataformaServicio.save(plataforma);
    }

    @PutMapping("/{id}")
    public void actualizar(@RequestBody Plataforma plataforma){
        plataformaServicio.save(plataforma);
    }
}
