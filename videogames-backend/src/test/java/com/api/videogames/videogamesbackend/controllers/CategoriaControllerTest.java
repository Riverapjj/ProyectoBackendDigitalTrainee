package com.api.videogames.videogamesbackend.controllers;

import com.api.videogames.videogamesbackend.models.entities.Categoria;
import com.api.videogames.videogamesbackend.repositorios.CategoriaRepository;
import com.api.videogames.videogamesbackend.repositorios.RolesRepository;
import com.api.videogames.videogamesbackend.servicios.dao.CategoriaDAO;
import com.api.videogames.videogamesbackend.servicios.dao.RolesDAO;
import com.api.videogames.videogamesbackend.servicios.implementaciones.CategoriaDAOImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

@SpringBootTest
class CategoriaControllerTest {
    @MockBean
    CategoriaRepository categoriaRepository;

    @Autowired
    CategoriaDAO categoriaDAO;

    @Autowired
    CategoriaDAOImpl categoriaDAOimpl;
    @Test
    void listar() {
        categoriaDAO.findAll();

        verify(categoriaRepository).findAll();
    }

    @Test
    void listarPorId() {
        categoriaDAO.findById(1);
        verify(categoriaRepository).findById(1);
    }

}