package com.api.videogames.videogamesbackend.models.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "direcciones")
public class Direccion implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String direccion;

    private String departamento;

    @Column(name = "codigo_postal")
    private String codigoPostal;

    @OneToMany(mappedBy = "direccion")
    private List<Usuario> usuarios;

    public Direccion() {
    }

    public Direccion(Integer id, String direccion, String departamento, String codigoPostal, List<Usuario> usuarios) {
        this.id = id;
        this.direccion = direccion;
        this.departamento = departamento;
        this.codigoPostal = codigoPostal;
        this.usuarios = usuarios;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
}
