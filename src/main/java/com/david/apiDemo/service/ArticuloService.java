package com.david.apiDemo.service;

import com.david.apiDemo.model.Articulo;

import java.util.Collection;

public interface ArticuloService {
    Collection<Articulo> findArticulos();
}
