package com.api.videogames.videogamesbackend.controllers;

import com.api.videogames.videogamesbackend.repositorios.CategoriaRepository;
import com.api.videogames.videogamesbackend.repositorios.DireccionRepository;
import com.api.videogames.videogamesbackend.servicios.dao.CategoriaDAO;
import com.api.videogames.videogamesbackend.servicios.dao.DireccionDAO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

@SpringBootTest

class DireccionControllerTest {
    @MockBean
    DireccionRepository direccionRepository;

    @Autowired
    DireccionDAO direccionDAO;
    @Test
    void listar() {
        direccionDAO.findAll();

        verify(direccionRepository).findAll();
    }

    @Test
    void listarPorId() {
        direccionDAO.findById(1);
        verify(direccionRepository).findById(1);
    }
}