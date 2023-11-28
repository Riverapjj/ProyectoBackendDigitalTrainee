package com.api.videogames.videogamesbackend.servicios.implementaciones;

import com.api.videogames.videogamesbackend.models.entities.Categoria;
import com.api.videogames.videogamesbackend.models.entities.Direccion;
import com.api.videogames.videogamesbackend.repositorios.CategoriaRepository;
import com.api.videogames.videogamesbackend.repositorios.DireccionRepository;
import com.api.videogames.videogamesbackend.servicios.dao.CategoriaDAO;
import com.api.videogames.videogamesbackend.servicios.dao.DireccionDAO;
import org.springframework.stereotype.Service;

@Service
public class DireccionDAOImpl extends GenericoDAOImpl<Direccion, DireccionRepository> implements DireccionDAO {
    public DireccionDAOImpl(DireccionRepository repository) {
        super(repository);
    }
}
