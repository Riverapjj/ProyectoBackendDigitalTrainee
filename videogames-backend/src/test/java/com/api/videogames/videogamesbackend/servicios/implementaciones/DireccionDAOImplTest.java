package com.api.videogames.videogamesbackend.servicios.implementaciones;

import com.api.videogames.videogamesbackend.repositorios.CategoriaRepository;
import com.api.videogames.videogamesbackend.repositorios.DireccionRepository;
import com.api.videogames.videogamesbackend.servicios.dao.CategoriaDAO;
import com.api.videogames.videogamesbackend.servicios.dao.DireccionDAO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.verify;

@SpringBootTest
class DireccionDAOImplTest {

    @MockBean
    DireccionRepository direccionRepository;

    @Autowired
    DireccionDAO direccionDAO;

    @Test
    void findByPostalCode() {
        direccionDAO.findByPostalCode(anyString());
        verify(direccionRepository).findByPostalCode(anyString());
    }
}
