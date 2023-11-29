package com.api.videogames.videogamesbackend.servicios.implementaciones;

import com.api.videogames.videogamesbackend.repositorios.CategoriaRepository;
import com.api.videogames.videogamesbackend.servicios.dao.CategoriaDAO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.verify;

@SpringBootTest
class CategoriaDAOImplTest {

    @MockBean
    CategoriaRepository categoriaRepository;

    @Autowired
    CategoriaDAO categoriaDAO;

    @Test
    void findByName() {
        categoriaDAO.findByName(anyString());

        verify(categoriaRepository).findByName(anyString());
    }
}