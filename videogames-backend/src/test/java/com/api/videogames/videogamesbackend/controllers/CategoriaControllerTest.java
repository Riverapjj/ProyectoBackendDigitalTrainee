package com.api.videogames.videogamesbackend.controllers;

import com.api.videogames.videogamesbackend.repositorios.CategoriaRepository;
import com.api.videogames.videogamesbackend.repositorios.RolesRepository;
import com.api.videogames.videogamesbackend.servicios.dao.CategoriaDAO;
import com.api.videogames.videogamesbackend.servicios.dao.RolesDAO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

@SpringBootTest
class CategoriaControllerTest {
    @MockBean
    CategoriaRepository categoriaRepository;

    @Autowired
    CategoriaDAO categoriaDAO;
    @Test
    void listar() {
        categoriaDAO.findAll();

        verify(categoriaRepository).findAll();
    }

    @Test
    void listarPorId() {
    }

    @Test
    void guardar() {
    }

    @Test
    void actualizar() {
    }
}