package com.api.videogames.videogamesbackend.repositorios;

import com.api.videogames.videogamesbackend.models.entities.Direccion;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface DireccionRepository extends CrudRepository<Direccion, Integer> {
    @Query("select d from Direccion d where d.codigoPostal = ?1")
    Iterable<Direccion> findByPostalCode(String postalCode);
}
