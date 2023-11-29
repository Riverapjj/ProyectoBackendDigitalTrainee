package com.api.videogames.videogamesbackend.servicios.implementaciones;

import com.api.videogames.videogamesbackend.models.entities.Categoria;
import com.api.videogames.videogamesbackend.repositorios.CategoriaRepository;
import com.api.videogames.videogamesbackend.servicios.dao.CategoriaDAO;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class CategoriaDAOImpl extends GenericoDAOImpl<Categoria, CategoriaRepository> implements CategoriaDAO {

    public CategoriaDAOImpl(CategoriaRepository repository) {
        super(repository);
    }

    @Override
    public Iterable<Categoria> findByName(String name) {
        return ((CategoriaRepository)repository).findByName(name);
    }
}
