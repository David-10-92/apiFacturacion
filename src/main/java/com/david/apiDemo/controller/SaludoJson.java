package com.david.apiDemo.controller;

public class SaludoJson {
    private String saludo;

    private String nombre = "David";

    public SaludoJson(String saludo) {
        this.saludo = saludo;
    }

    public String getSaludo() {
        return saludo;
    }

    public void setSaludo(String saludo) {
        this.saludo = saludo;
    }

    public String getNombre() {
        return nombre;
    }
}
