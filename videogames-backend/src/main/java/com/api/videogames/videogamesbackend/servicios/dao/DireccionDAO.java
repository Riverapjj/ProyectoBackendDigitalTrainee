package com.api.videogames.videogamesbackend.servicios.dao;

import com.api.videogames.videogamesbackend.models.entities.Direccion;

public interface DireccionDAO extends GenericDAO<Direccion>{
    Iterable<Direccion> findByPostalCode(String codigoPostal);

}
