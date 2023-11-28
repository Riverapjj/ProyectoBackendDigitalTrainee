package com.api.videogames.videogamesbackend.servicios.implementaciones;

import com.api.videogames.videogamesbackend.models.entities.Categoria;
import com.api.videogames.videogamesbackend.models.entities.Factura;
import com.api.videogames.videogamesbackend.repositorios.CategoriaRepository;
import com.api.videogames.videogamesbackend.repositorios.FacturaRepository;
import com.api.videogames.videogamesbackend.servicios.dao.CategoriaDAO;
import com.api.videogames.videogamesbackend.servicios.dao.FacturaDAO;
import org.springframework.stereotype.Service;

@Service
public class FacturaDAOImpl extends GenericoDAOImpl<Factura, FacturaRepository> implements FacturaDAO {
    public FacturaDAOImpl(FacturaRepository repository) {
        super(repository);
    }
}
