package com.api.videogames.videogamesbackend.servicios.implementaciones;

import com.api.videogames.videogamesbackend.models.entities.Roles;
import com.api.videogames.videogamesbackend.repositorios.RolesRepository;
import com.api.videogames.videogamesbackend.servicios.dao.RolesDAO;
import org.springframework.stereotype.Service;

@Service
public class RolesDAOImpl extends GenericoDAOImpl<Roles, RolesRepository> implements RolesDAO {
    public RolesDAOImpl(RolesRepository repository) {
        super(repository);
    }
}
