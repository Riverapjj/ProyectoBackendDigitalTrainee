package com.api.videogames.videogamesbackend.controllers.controllers;

import com.api.videogames.videogamesbackend.models.entities.ItemFactura;
import com.api.videogames.videogamesbackend.servicios.implementaciones.ItemFacturaDAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/item-factura")
public class ItemFacturaController {
    @Autowired
    ItemFacturaDAOImpl itemFacturaServicio;

    @GetMapping("/")
    public List<ItemFactura> listar(){
        return (List<ItemFactura>) itemFacturaServicio.findAll();
    }

    @GetMapping("/{id}")
    public void listarPorId(@PathVariable Integer id){
        itemFacturaServicio.findById(id);
    }

    @PostMapping("/")
    public void guardar(@RequestBody ItemFactura itemFactura){
        itemFacturaServicio.save(itemFactura);
    }

    @PutMapping("/{id}")
    public void actualizar(@RequestBody ItemFactura itemFactura){
        itemFacturaServicio.save(itemFactura);
    }
}
