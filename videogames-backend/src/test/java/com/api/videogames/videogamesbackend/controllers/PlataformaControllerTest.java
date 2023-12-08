package com.api.videogames.videogamesbackend.controllers;

import com.api.videogames.videogamesbackend.repositorios.PlataformaRepository;
import com.api.videogames.videogamesbackend.repositorios.ServicioRepository;
import com.api.videogames.videogamesbackend.servicios.dao.PlataformaDAO;
import com.api.videogames.videogamesbackend.servicios.dao.ServicioDAO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;


@SpringBootTest
class PlataformaControllerTest {

    @MockBean
    PlataformaRepository plataformaRepository;

    @Autowired
    PlataformaDAO plataformaDAO;
    @Test
    void listar() {
        plataformaDAO.findAll();

        verify(plataformaRepository).findAll();
    }

    @Test
    void listarPorId() {
        plataformaDAO.findById(1);
        verify(plataformaRepository).findById(1);
    }
}