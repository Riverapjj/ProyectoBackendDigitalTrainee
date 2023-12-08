package com.api.videogames.videogamesbackend.repositorios;

import com.api.videogames.videogamesbackend.models.entities.Videojuego;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface VideojuegoRepository extends CrudRepository<Videojuego, Integer> {
    @Query("select d from Videojuego d where d.id = ?1")
    Iterable<Videojuego> findByNombre(String RolId);
}
