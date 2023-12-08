package com.api.videogames.videogamesbackend.repositorios;

import com.api.videogames.videogamesbackend.models.entities.Servicio;
import com.api.videogames.videogamesbackend.models.entities.Servicio;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ServicioRepository extends CrudRepository<Servicio, Integer> {

    @Query("select d from Servicio d where d.id = ?1")
    Iterable<Servicio> findById(String ServicioId);

}
