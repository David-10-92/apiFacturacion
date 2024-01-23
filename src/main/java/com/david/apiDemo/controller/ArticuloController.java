package com.david.apiDemo.controller;

import com.david.apiDemo.model.Articulo;
import com.david.apiDemo.service.ArticuloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/api")
public class ArticuloController {

    private final ArticuloService articuloService;

    @Autowired
    public ArticuloController(ArticuloService articuloService) {
        this.articuloService = articuloService;
    }

    @GetMapping("/articulos")
    public Collection<Articulo> articulos(){
        return articuloService.findArticulos();
    }
}
