package com.api.videogames.videogamesbackend.repositorios;

import com.api.videogames.videogamesbackend.models.entities.Categoria;
import com.api.videogames.videogamesbackend.models.entities.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UsuariosRepository extends CrudRepository<Usuario,Integer> {
    @Query("select u from Usuario u join fetch u.roles c where c.nombre = ?1")
    Iterable<Usuario> findByRole(String rol);

    @Query("select u from Usuario u where u.nombre = ?1")
    Iterable<Usuario> findByName(String name);
}
