package com.api.videogames.videogamesbackend.servicios.implementaciones;

import com.api.videogames.videogamesbackend.repositorios.CategoriaRepository;
import com.api.videogames.videogamesbackend.repositorios.UsuariosRepository;
import com.api.videogames.videogamesbackend.servicios.dao.CategoriaDAO;
import com.api.videogames.videogamesbackend.servicios.dao.UsuariosDAO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.verify;

@SpringBootTest
class UsuarioDAOImplTest {
    @MockBean
    UsuariosRepository usuarioRepository;

    @Autowired
    UsuariosDAO usuariosDAO;

    @Test
    void findByName() {
        usuariosDAO.findByName(anyString());

        verify(usuarioRepository).findByName(anyString());
    }

    @Test
    void findByRole() {
        usuariosDAO.findByRole(anyString());

        verify(usuarioRepository).findByRole(anyString());
    }
}