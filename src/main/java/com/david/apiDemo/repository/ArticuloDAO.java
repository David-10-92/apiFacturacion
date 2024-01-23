package com.david.apiDemo.repository;

import com.david.apiDemo.model.Articulo;

import java.util.Collection;

public interface ArticuloDAO {

    Collection<Articulo> findArticulos();
}
