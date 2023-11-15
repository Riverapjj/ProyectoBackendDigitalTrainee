package com.api.videogames.videogamesbackend.entities.models;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "item_factura")
public class ItemFactura implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer cantidad;

    private Integer total;

    private Factura factura;
    private String producto;

    public ItemFactura() {
    }

    public ItemFactura(Integer id, Integer cantidad, Integer total, Factura factura, String producto) {
        this.id = id;
        this.cantidad = cantidad;
        this.total = total;
        this.factura = factura;
        this.producto = producto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }
}
