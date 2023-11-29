package com.api.videogames.videogamesbackend.servicios.implementaciones;

import com.api.videogames.videogamesbackend.repositorios.CategoriaRepository;
import com.api.videogames.videogamesbackend.repositorios.PlataformaRepository;
import com.api.videogames.videogamesbackend.servicios.dao.CategoriaDAO;
import com.api.videogames.videogamesbackend.servicios.dao.PlataformaDAO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.verify;

@SpringBootTest
class PlataformaDAOImplTest {
    @MockBean
    PlataformaRepository plataformaRepository;

    @Autowired
    PlataformaDAO plataformaDAO;
    @Test
    void findByFabricante() {
        plataformaDAO.findByFabricante(anyString());

        verify(plataformaRepository).findByFabricante(anyString());
    }
}