package com.api.videogames.videogamesbackend.controllers;

import com.api.videogames.videogamesbackend.repositorios.ItemFacturaRepository;
import com.api.videogames.videogamesbackend.repositorios.ServicioRepository;
import com.api.videogames.videogamesbackend.servicios.dao.ItemFacturaDAO;
import com.api.videogames.videogamesbackend.servicios.dao.ServicioDAO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

@SpringBootTest
class ItemFacturaControllerTest {

    @MockBean
    ItemFacturaRepository itemFacturaRepository;

    @Autowired
    ItemFacturaDAO itemFacturaDAO;
    @Test
    void listar() {
        itemFacturaDAO.findAll();

        verify(itemFacturaRepository).findAll();
    }

    @Test
    void listarPorId() {
        itemFacturaDAO.findById(1);
        verify(itemFacturaRepository).findById(1);
    }
}