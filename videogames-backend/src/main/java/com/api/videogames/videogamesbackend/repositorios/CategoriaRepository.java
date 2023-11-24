package com.api.videogames.videogamesbackend.repositorios;

import com.api.videogames.videogamesbackend.models.entities.Categoria;
import org.springframework.data.repository.CrudRepository;

public interface CategoriaRepository extends CrudRepository<Categoria, Integer> {
}
