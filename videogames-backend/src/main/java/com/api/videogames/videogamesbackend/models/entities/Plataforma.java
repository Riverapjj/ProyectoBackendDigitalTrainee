package com.api.videogames.videogamesbackend.models.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "plataformas")
public class Plataforma implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre;

    private String fabricante;

    private String especificaciones;
    @JsonIgnore
    @OneToMany(mappedBy = "plataforma")
    private List<Videojuego> videojuegos;

    public Plataforma() {
    }

    public Plataforma(Integer id, String nombre, String fabricante, String especificaciones, List<Videojuego> videojuego) {
        this.id = id;
        this.nombre = nombre;
        this.fabricante = fabricante;
        this.especificaciones = especificaciones;
        this.videojuegos = videojuego;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Videojuego> getVideojuegos() {
        return videojuegos;
    }

    public void setVideojuegos(List<Videojuego> videojuegos) {
        this.videojuegos = videojuegos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getEspecificaciones() {
        return especificaciones;
    }

    public void setEspecificaciones(String especificaciones) {
        this.especificaciones = especificaciones;
    }
}
