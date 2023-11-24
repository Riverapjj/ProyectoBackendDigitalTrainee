package com.api.videogames.videogamesbackend.repositorios;

import com.api.videogames.videogamesbackend.models.entities.Videojuego;
import org.springframework.data.repository.CrudRepository;

public interface VideojuegoRepository extends CrudRepository<Videojuego, Integer> {
}
