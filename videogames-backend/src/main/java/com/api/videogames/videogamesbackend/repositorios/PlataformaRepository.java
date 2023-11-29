package com.api.videogames.videogamesbackend.repositorios;

import com.api.videogames.videogamesbackend.models.entities.Plataforma;
import com.api.videogames.videogamesbackend.models.entities.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface PlataformaRepository extends CrudRepository<Plataforma, Integer> {

    @Query("select p from Plataforma p where p.fabricante = ?1")
    Iterable<Plataforma> findByFabricante(String fabricante);
}
