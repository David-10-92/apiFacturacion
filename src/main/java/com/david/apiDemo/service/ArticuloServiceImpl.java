package com.david.apiDemo.service;

import com.david.apiDemo.model.Articulo;
import com.david.apiDemo.repository.ArticuloDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ArticuloServiceImpl implements ArticuloService{

    private final ArticuloDAO articulo;

    @Autowired
    public ArticuloServiceImpl(ArticuloDAO articulo) {
        this.articulo = articulo;
    }

    @Override
    public Collection<Articulo> findArticulos() {
        return articulo.findArticulos();
    }
}
