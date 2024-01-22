package com.david.apiDemo.model;

import java.util.Collection;

public class Factura {

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
