package com.david.apiDemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Collection;

@Entity
@Table (name = "facturas")
public class Factura {

    @Id
    private int id;
    private Cliente cliente;
    private Collection<Articulo> articulos;

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
