package com.example.SaludosRest;

public class Saludos {
    private final long id;
    private final String contenido;
    //private final String pais;

    public Saludos(long id, String contenido) {
        this.id = id;
        this.contenido = contenido;

    }

    public long getId() {
        return id;
    }

    public String getContenido() {
        return contenido;
    }

    //public String getPais() {
    //    return pais;
    //}
}
