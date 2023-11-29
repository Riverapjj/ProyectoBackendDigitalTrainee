package com.api.videogames.videogamesbackend.servicios.implementaciones;

import com.api.videogames.videogamesbackend.models.entities.Categoria;
import com.api.videogames.videogamesbackend.models.entities.Usuario;
import com.api.videogames.videogamesbackend.repositorios.CategoriaRepository;
import com.api.videogames.videogamesbackend.repositorios.UsuariosRepository;
import com.api.videogames.videogamesbackend.servicios.dao.CategoriaDAO;
import com.api.videogames.videogamesbackend.servicios.dao.UsuariosDAO;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class UsuarioDAOImpl extends GenericoDAOImpl<Usuario, UsuariosRepository> implements UsuariosDAO {
    public UsuarioDAOImpl(UsuariosRepository repository) {
        super(repository);
    }

    @Override
    public Iterable<Usuario> findByName(String name) {
        return ((UsuariosRepository)repository).findByName(name);
    }

    @Override
    public Iterable<Usuario> findByRole(String role) {
        return ((UsuariosRepository)repository).findByRole(role);
    }
}
