package com.api.videogames.videogamesbackend.models.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
public class Factura implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer total;

    private Usuario usuario;

    private Videojuego videojuego;

    private Servicio servicio;

    @OneToMany
    private List<ItemFactura> itemFacturas;

    public Factura() {
    }

    public Factura(Integer id, Integer total, Usuario usuario, Videojuego videojuego, Servicio servicio, List<ItemFactura> itemFacturas) {
        this.id = id;
        this.total = total;
        this.usuario = usuario;
        this.videojuego = videojuego;
        this.servicio = servicio;
        this.itemFacturas = itemFacturas;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Videojuego getVideojuego() {
        return videojuego;
    }

    public void setVideojuego(Videojuego videojuego) {
        this.videojuego = videojuego;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public List<ItemFactura> getItemFacturas() {
        return itemFacturas;
    }

    public void setItemFacturas(List<ItemFactura> itemFacturas) {
        this.itemFacturas = itemFacturas;
    }
}
