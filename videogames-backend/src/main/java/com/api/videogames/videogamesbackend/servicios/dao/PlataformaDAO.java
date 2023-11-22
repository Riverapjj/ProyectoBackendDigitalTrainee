package com.api.videogames.videogamesbackend.servicios.dao;

import com.api.videogames.videogamesbackend.models.entities.Plataforma;

import java.util.Optional;

public interface PlataformaDAO extends GenericDAO<Plataforma>{

    Optional<Plataforma> findByFabricante(String fabricante);
}
