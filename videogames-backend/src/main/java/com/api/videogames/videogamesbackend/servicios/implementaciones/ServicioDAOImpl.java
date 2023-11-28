package com.api.videogames.videogamesbackend.servicios.implementaciones;

import com.api.videogames.videogamesbackend.models.entities.Categoria;
import com.api.videogames.videogamesbackend.models.entities.Servicio;
import com.api.videogames.videogamesbackend.repositorios.CategoriaRepository;
import com.api.videogames.videogamesbackend.repositorios.ServicioRepository;
import com.api.videogames.videogamesbackend.servicios.dao.CategoriaDAO;
import com.api.videogames.videogamesbackend.servicios.dao.ServicioDAO;
import org.springframework.stereotype.Service;

@Service
public class ServicioDAOImpl extends GenericoDAOImpl<Servicio, ServicioRepository> implements ServicioDAO {
    public ServicioDAOImpl(ServicioRepository repository) {
        super(repository);
    }
}
