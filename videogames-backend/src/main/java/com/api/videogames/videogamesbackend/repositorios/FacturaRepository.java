package com.api.videogames.videogamesbackend.repositorios;

import com.api.videogames.videogamesbackend.models.entities.Factura;
import org.springframework.data.repository.CrudRepository;

public interface FacturaRepository extends CrudRepository<Factura, Integer> {
}
