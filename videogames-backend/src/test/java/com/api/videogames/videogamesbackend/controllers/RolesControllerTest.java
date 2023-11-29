package com.api.videogames.videogamesbackend.controllers;

import com.api.videogames.videogamesbackend.repositorios.RolesRepository;
import com.api.videogames.videogamesbackend.servicios.dao.RolesDAO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.verify;

@SpringBootTest
class RolesControllerTest {

    @MockBean
    RolesRepository rolesRepository;

    @Autowired
    RolesDAO rolesDAO;

    @Test
    void listar() {

        rolesDAO.findAll();

        verify(rolesRepository).findAll();
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