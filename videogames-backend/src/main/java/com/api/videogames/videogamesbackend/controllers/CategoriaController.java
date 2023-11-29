package com.api.videogames.videogamesbackend.controllers;

import com.api.videogames.videogamesbackend.models.entities.Categoria;
import com.api.videogames.videogamesbackend.servicios.implementaciones.CategoriaDAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public void listarPorId(@PathVariable Integer id){
        categoriaServicio.findById(id);
    }

    @PostMapping("/")
    public void guardar(@RequestBody Categoria categoria){
        categoriaServicio.save(categoria);
    }

    @PutMapping("/{id}")
    public void actualizar(@RequestBody Categoria categoria){
        categoriaServicio.save(categoria);
    }
}
