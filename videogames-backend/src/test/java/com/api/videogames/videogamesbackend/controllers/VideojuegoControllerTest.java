package com.api.videogames.videogamesbackend.controllers;

import com.api.videogames.videogamesbackend.repositorios.ServicioRepository;
import com.api.videogames.videogamesbackend.repositorios.VideojuegoRepository;
import com.api.videogames.videogamesbackend.servicios.dao.ServicioDAO;
import com.api.videogames.videogamesbackend.servicios.dao.VideojuegoDAO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

@SpringBootTest
class VideojuegoControllerTest {

    @MockBean
    VideojuegoRepository videojuegoRepository;

    @Autowired
    VideojuegoDAO videojuegoDAO;
    @Test
    void listar() {
        videojuegoDAO.findAll();

        verify(videojuegoRepository).findAll();
    }

    @Test
    void listarPorId() {
        videojuegoDAO.findById(1);
        verify(videojuegoRepository).findById(1);
    }
}