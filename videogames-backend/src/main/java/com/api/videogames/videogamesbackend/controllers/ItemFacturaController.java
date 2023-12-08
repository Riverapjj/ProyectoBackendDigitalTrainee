package com.api.videogames.videogamesbackend.controllers;

import com.api.videogames.videogamesbackend.models.entities.ItemFactura;
import com.api.videogames.videogamesbackend.servicios.implementaciones.ItemFacturaDAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    public Optional<ItemFactura> listarPorId(@PathVariable Integer id){
        return itemFacturaServicio.findById(id);
    }

    @PostMapping("/")
    public ItemFactura guardar(@RequestBody ItemFactura itemFactura){
        return itemFacturaServicio.save(itemFactura);
    }

    @PutMapping("/{id}")
    public ItemFactura actualizar(@RequestBody ItemFactura itemFactura){
        return itemFacturaServicio.save(itemFactura);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id){
        itemFacturaServicio.deleteById(id);
    }
}
