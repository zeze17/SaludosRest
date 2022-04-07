package com.example.SaludosRest;

public class Saludos {
    private final long id;
    private final String contenido;
    //private  String pais;

    public Saludos(long id, String contenido) {
        this.id = id;
        this.contenido = contenido;
        //this.pais = pais;
    }

    public long getId() {
        return id;
    }

    public String getContenido() {
        return contenido;
    }



}
