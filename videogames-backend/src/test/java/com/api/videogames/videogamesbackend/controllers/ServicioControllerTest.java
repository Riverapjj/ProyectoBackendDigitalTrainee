package com.api.videogames.videogamesbackend.controllers;

import com.api.videogames.videogamesbackend.repositorios.RolesRepository;
import com.api.videogames.videogamesbackend.repositorios.ServicioRepository;
import com.api.videogames.videogamesbackend.servicios.dao.RolesDAO;
import com.api.videogames.videogamesbackend.servicios.dao.ServicioDAO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

@SpringBootTest
class ServicioControllerTest {
    @MockBean
    ServicioRepository servicioRepository;

    @Autowired
    ServicioDAO servicioDAO;
    @Test
    void listar() {
        servicioDAO.findAll();

        verify(servicioRepository).findAll();
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