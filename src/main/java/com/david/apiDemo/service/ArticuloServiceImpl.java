package com.david.apiDemo.service;

import com.david.apiDemo.model.Articulo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class ArticuloServiceImpl implements ArticuloService{

    @Override
    public Collection<Articulo> findArticulos() {
        List<Articulo> nuevosArticulos = new ArrayList<>();
        nuevosArticulos.add(new Articulo(1,"Boligrafo",2.80));
        nuevosArticulos.add( new Articulo(1,"Lapiz",1.80));
        nuevosArticulos.add( new Articulo(1,"Goma",0.80));
        return nuevosArticulos;
    }
}
