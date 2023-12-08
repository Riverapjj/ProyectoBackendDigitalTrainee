package com.api.videogames.videogamesbackend.controllers;

import com.api.videogames.videogamesbackend.models.entities.Categoria;
import com.api.videogames.videogamesbackend.servicios.implementaciones.CategoriaDAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

    @Autowired
    CategoriaDAOImpl categoriaServicio;

    @GetMapping("/")
    public List<Categoria> listar(){
        return (List<Categoria>) categoriaServicio.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Categoria> listarPorId(@PathVariable Integer id){
        return categoriaServicio.findById(id);
    }

    @PostMapping("/")
    public Categoria guardar(@RequestBody Categoria categoria){
        return categoriaServicio.save(categoria);
    }

    @PutMapping("/{id}")
    public Categoria actualizar(@RequestBody Categoria categoria){
        return categoriaServicio.save(categoria);
    }
}
