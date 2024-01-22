package com.david.apiDemo.controller;

import com.david.apiDemo.model.Articulo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ArticuloController {

    @GetMapping("/articulos")
    public Collection<Articulo> articulos(){
        List<Articulo> nuevosArticulos = new ArrayList<>();
        nuevosArticulos.add(new Articulo(1,"Boligrafo",2.80));
        nuevosArticulos.add( new Articulo(1,"Lapiz",1.80));
        nuevosArticulos.add( new Articulo(1,"Goma",0.80));
        return nuevosArticulos;
    }
}
