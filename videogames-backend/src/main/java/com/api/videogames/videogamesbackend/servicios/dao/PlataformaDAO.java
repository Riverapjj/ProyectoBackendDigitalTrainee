package com.api.videogames.videogamesbackend.servicios.dao;

import com.api.videogames.videogamesbackend.models.entities.Plataforma;

import java.util.Optional;

public interface PlataformaDAO extends GenericDAO<Plataforma>{

    Iterable<Plataforma> findByFabricante(String fabricante);
}
