package com.api.videogames.videogamesbackend.repositorios;

import com.api.videogames.videogamesbackend.models.entities.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuariosRepository extends CrudRepository<Usuario,Integer> {
}
