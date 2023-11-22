package com.api.videogames.videogamesbackend.servicios.dao;

import com.api.videogames.videogamesbackend.models.entities.Usuario;

import java.util.Optional;

public interface UsuariosDAO extends GenericDAO<Usuario>{

    Optional<Usuario> findByName(String name);
    Optional<Usuario> findByRole(String role);
}
