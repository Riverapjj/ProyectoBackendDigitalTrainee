package com.api.videogames.videogamesbackend.models.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.io.Serializable;
import java.util.List;

public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre;

    private String apellido;

    private Roles roles;

    private Direccion direccion;

    @OneToMany
    private List<Factura> facturas;

    public Usuario() {
    }

    public Usuario(Integer id, String nombre, String apellido, Roles roles, Direccion direccion, List<Factura> facturas) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.roles = roles;
        this.direccion = direccion;
        this.facturas = facturas;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Roles getRoles() {
        return roles;
    }

    public void setRoles(Roles roles) {
        this.roles = roles;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public List<Factura> getFacturas() {
        return facturas;
    }

    public void setFacturas(List<Factura> facturas) {
        this.facturas = facturas;
    }
}
