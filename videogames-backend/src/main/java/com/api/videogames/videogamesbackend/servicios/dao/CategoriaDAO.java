package com.api.videogames.videogamesbackend.servicios.dao;

import com.api.videogames.videogamesbackend.models.entities.Categoria;

import java.util.Optional;

public interface CategoriaDAO extends GenericDAO<Categoria> {

    Iterable<Categoria> findByName(String name);
}
