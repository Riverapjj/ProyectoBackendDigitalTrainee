package com.api.videogames.videogamesbackend.controllers.controllers;

import com.api.videogames.videogamesbackend.models.entities.Videojuego;
import com.api.videogames.videogamesbackend.servicios.implementaciones.VideojuegoDAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/videojuego")
public class VideojuegoController {
    @Autowired
    VideojuegoDAOImpl videojuegoServicio;

    @GetMapping("/")
    public List<Videojuego> listar(){
        return (List<Videojuego>) videojuegoServicio.findAll();
    }

    @GetMapping("/{id}")
    public void listarPorId(@PathVariable Integer id){
        videojuegoServicio.findById(id);
    }

    @PostMapping("/")
    public void guardar(@RequestBody Videojuego videojuego){
        videojuegoServicio.save(videojuego);
    }

    @PutMapping("/{id}")
    public void actualizar(@RequestBody Videojuego videojuego){
        videojuegoServicio.save(videojuego);
    }
}
