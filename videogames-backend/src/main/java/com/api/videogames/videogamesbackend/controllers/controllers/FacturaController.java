package com.api.videogames.videogamesbackend.controllers.controllers;

import com.api.videogames.videogamesbackend.models.entities.Factura;
import com.api.videogames.videogamesbackend.servicios.implementaciones.FacturaDAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public void listarPorId(@PathVariable Integer id){
        facturaServicio.findById(id);
    }

    @PostMapping("/")
    public void guardar(@RequestBody Factura factura){
        facturaServicio.save(factura);
    }

    @PutMapping("/{id}")
    public void actualizar(@RequestBody Factura factura){
        facturaServicio.save(factura);
    }
}
