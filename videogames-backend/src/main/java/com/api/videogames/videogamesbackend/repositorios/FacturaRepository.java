package com.api.videogames.videogamesbackend.repositorios;

import com.api.videogames.videogamesbackend.models.entities.Factura;
import com.api.videogames.videogamesbackend.models.entities.Factura;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface FacturaRepository extends CrudRepository<Factura, Integer> {
    @Query("select d from Factura d where d.id = ?1")
    Iterable<Factura> findById(String facturaId);
}
