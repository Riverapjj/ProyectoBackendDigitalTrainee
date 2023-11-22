package com.api.videogames.videogamesbackend.servicios.dao;

import com.api.videogames.videogamesbackend.models.entities.Videojuego;

import java.util.Optional;

public interface VideojuegoDAO extends GenericDAO<Videojuego> {

    Optional<Videojuego> findByName(String name);
    Optional<Videojuego> findByCategoria(String categoria);

}
