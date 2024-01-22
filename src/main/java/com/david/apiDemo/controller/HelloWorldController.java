package com.david.apiDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloWorldController {

    @GetMapping("/saludo")
    public String saludar(){
        return "Hola mundo";
    }

    @GetMapping("/saludoJson")
    public SaludoJson saludarJson(){
        return new SaludoJson("Hola Json");
    }

}
