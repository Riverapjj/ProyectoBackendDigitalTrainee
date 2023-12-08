package com.api.videogames.videogamesbackend.controllers;

import com.api.videogames.videogamesbackend.repositorios.FacturaRepository;
import com.api.videogames.videogamesbackend.repositorios.ServicioRepository;
import com.api.videogames.videogamesbackend.servicios.dao.FacturaDAO;
import com.api.videogames.videogamesbackend.servicios.dao.ServicioDAO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

@SpringBootTest
class FacturaControllerTest {

    @MockBean
    FacturaRepository facturaRepository;

    @Autowired
    FacturaDAO facturaDAO;
    @Test
    void listar() {
        facturaDAO.findAll();

        verify(facturaRepository).findAll();
    }

    @Test
    void listarPorId() {
        facturaDAO.findById(1);
        verify(facturaRepository).findById(1);
    }
}