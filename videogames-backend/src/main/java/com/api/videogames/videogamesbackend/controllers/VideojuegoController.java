package com.api.videogames.videogamesbackend.controllers;

import com.api.videogames.videogamesbackend.models.entities.Videojuego;
import com.api.videogames.videogamesbackend.servicios.implementaciones.VideojuegoDAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    public Optional<Videojuego> listarPorId(@PathVariable Integer id){
        return videojuegoServicio.findById(id);
    }

    @PostMapping("/")
    public Videojuego guardar(@RequestBody Videojuego videojuego){
        return videojuegoServicio.save(videojuego);
    }

    @PutMapping("/{id}")
    public Videojuego actualizar(@RequestBody Videojuego videojuego){
        return videojuegoServicio.save(videojuego);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id){
        videojuegoServicio.deleteById(id);
    }
}
