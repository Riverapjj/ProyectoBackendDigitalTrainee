package com.api.videogames.videogamesbackend.controllers;

import com.api.videogames.videogamesbackend.models.entities.Factura;
import com.api.videogames.videogamesbackend.servicios.implementaciones.FacturaDAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/factura")
public class FacturaController {
    @Autowired
    FacturaDAOImpl facturaServicio;

    @GetMapping("/")
    public List<Factura> listar(){
        return (List<Factura>) facturaServicio.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Factura> listarPorId(@PathVariable Integer id){
        return facturaServicio.findById(id);
    }

    @PostMapping("/")
    public Factura guardar(@RequestBody Factura factura){
        return facturaServicio.save(factura);
    }

    @PutMapping("/{id}")
    public Factura actualizar(@RequestBody Factura factura){
        return facturaServicio.save(factura);
    }
}
