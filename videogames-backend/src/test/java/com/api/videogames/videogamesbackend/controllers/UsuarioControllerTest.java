package com.api.videogames.videogamesbackend.controllers;

import com.api.videogames.videogamesbackend.repositorios.ServicioRepository;
import com.api.videogames.videogamesbackend.repositorios.UsuariosRepository;
import com.api.videogames.videogamesbackend.servicios.dao.ServicioDAO;
import com.api.videogames.videogamesbackend.servicios.dao.UsuariosDAO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

@SpringBootTest
class UsuarioControllerTest {

    @MockBean
    UsuariosRepository usuariosRepository;

    @Autowired
    UsuariosDAO usuariosDAO;
    @Test
    void listar() {
        usuariosDAO.findAll();

        verify(usuariosRepository).findAll();
    }

    @Test
    void listarPorId() {
        usuariosDAO.findById(1);
        verify(usuariosRepository).findById(1);
    }
}