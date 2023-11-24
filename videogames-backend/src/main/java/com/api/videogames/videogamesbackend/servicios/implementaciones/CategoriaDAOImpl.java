package com.api.videogames.videogamesbackend.servicios.implementaciones;

import com.api.videogames.videogamesbackend.models.entities.Categoria;
import com.api.videogames.videogamesbackend.repositorios.CategoriaRepository;
import com.api.videogames.videogamesbackend.servicios.dao.CategoriaDAO;

import java.util.Optional;

public class CategoriaDAOImpl extends GenericoDAOImpl<Categoria, CategoriaRepository> implements CategoriaDAO {

    public CategoriaDAOImpl(CategoriaRepository repository) {
        super(repository);
    }

    @Override
    public Optional<Categoria> findByName(String name) {
        return Optional.empty();
    }
}
