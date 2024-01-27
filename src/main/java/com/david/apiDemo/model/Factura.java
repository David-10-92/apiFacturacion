package com.david.apiDemo.model;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
@Table (name = "facturas")
public class Factura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToOne
    private Cliente cliente;
    @OneToMany
    private Collection<Articulo> articulos;

    public Factura() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Collection<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(Collection<Articulo> articulos) {
        this.articulos = articulos;
    }
}
