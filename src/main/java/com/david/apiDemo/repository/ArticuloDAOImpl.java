package com.david.apiDemo.repository;

import com.david.apiDemo.model.Articulo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Repository
public class ArticuloDAOImpl implements ArticuloDAO {

    @Override
    public Collection<Articulo> findArticulos() {
        List<Articulo> nuevosArticulos = new ArrayList<>();
        nuevosArticulos.add(new Articulo(1,"Boligrafo",2.80));
        nuevosArticulos.add( new Articulo(1,"Lapiz",1.80));
        nuevosArticulos.add( new Articulo(1,"Goma",0.80));
        return nuevosArticulos;
    }
}
