package com.api.videogames.videogamesbackend.servicios.dao;

import com.api.videogames.videogamesbackend.models.entities.Usuario;

import java.util.Optional;

public interface UsuariosDAO extends GenericDAO<Usuario>{

    Iterable<Usuario> findByName(String name);
    Iterable<Usuario> findByRole(String role);
}
