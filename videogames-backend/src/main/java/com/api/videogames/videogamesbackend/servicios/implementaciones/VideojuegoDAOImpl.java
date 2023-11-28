package com.api.videogames.videogamesbackend.servicios.implementaciones;

import com.api.videogames.videogamesbackend.models.entities.Categoria;
import com.api.videogames.videogamesbackend.models.entities.Videojuego;
import com.api.videogames.videogamesbackend.repositorios.CategoriaRepository;
import com.api.videogames.videogamesbackend.repositorios.VideojuegoRepository;
import com.api.videogames.videogamesbackend.servicios.dao.CategoriaDAO;
import com.api.videogames.videogamesbackend.servicios.dao.VideojuegoDAO;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class VideojuegoDAOImpl extends GenericoDAOImpl<Videojuego, VideojuegoRepository> implements VideojuegoDAO {
    public VideojuegoDAOImpl(VideojuegoRepository repository) {
        super(repository);
    }

    @Override
    public Optional<Videojuego> findByName(String name) {
        return Optional.empty();
    }

    @Override
    public Optional<Videojuego> findByCategoria(String categoria) {
        return Optional.empty();
    }
}
