package com.api.videogames.videogamesbackend.repositorios;

import com.api.videogames.videogamesbackend.models.entities.Categoria;
import com.api.videogames.videogamesbackend.models.entities.Servicio;
import com.api.videogames.videogamesbackend.models.entities.Usuario;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class UsuariosRepositoryTest {
    Usuario usuario = new Usuario(1, "Ricardo", "Aparicio", null, null, null);

    @Autowired
    UsuariosRepository usuarioRepository;
    @Test
    void findByRole() {
    }

    @Test
    void findByName() {
        usuarioRepository.save(usuario);
        Iterable<Usuario> usuarios = usuarioRepository.findByName(usuario.getNombre());

        String categoriaNombre = "Ricardo";

        List<Usuario> expected = (List<Usuario>)((UsuariosRepository)usuarioRepository).findByName(categoriaNombre);

        assertThat(expected.size() == 1).isTrue();
    }
}