package com.api.videogames.videogamesbackend.servicios.implementaciones;

import com.api.videogames.videogamesbackend.models.entities.Categoria;
import com.api.videogames.videogamesbackend.models.entities.Plataforma;
import com.api.videogames.videogamesbackend.repositorios.CategoriaRepository;
import com.api.videogames.videogamesbackend.repositorios.PlataformaRepository;
import com.api.videogames.videogamesbackend.servicios.dao.CategoriaDAO;
import com.api.videogames.videogamesbackend.servicios.dao.PlataformaDAO;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class PlataformaDAOImpl extends GenericoDAOImpl<Plataforma, PlataformaRepository> implements PlataformaDAO{
    public PlataformaDAOImpl(PlataformaRepository repository) {
        super(repository);
    }

    @Override
    public Optional<Plataforma> findByFabricante(String fabricante) {
        return Optional.empty();
    }
}
