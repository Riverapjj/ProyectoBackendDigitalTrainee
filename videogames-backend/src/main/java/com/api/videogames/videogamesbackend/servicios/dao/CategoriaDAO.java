package com.api.videogames.videogamesbackend.servicios.dao;

import com.api.videogames.videogamesbackend.models.entities.Categoria;


public interface CategoriaDAO extends GenericDAO<Categoria> {

    Iterable<Categoria> findByName(String name);
}
