package com.api.videogames.videogamesbackend.repositorios;

import com.api.videogames.videogamesbackend.models.entities.Categoria;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
class CategoriaRepositoryTest {


    Categoria categoria1 = new Categoria(1, "Accion", new ArrayList<>());

    @Autowired
    CategoriaRepository categoriaRepository;

    @Test
    void findByName() {

        categoriaRepository.save(categoria1);
        Iterable<Categoria> categorias = categoriaRepository.findByName(categoria1.getNombre());

        String categoriaNombre = "Accion";

        List<Categoria> expected = (List<Categoria>)((CategoriaRepository) categoriaRepository).findByName(categoriaNombre);

        assertThat(expected.size() == 1).isTrue();
    }
}