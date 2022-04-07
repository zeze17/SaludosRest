package com.example.SaludosRest;

public class Saludos {
    private  long id;
    private  String contenido;
    private  String pais;

    public Saludos(long id, String contenido, String pais) {
        this.id = id;
        this.contenido = contenido;
        this.pais = pais;
    }

    public long getId() {
        return id;
    }

    public String getContenido() {
        return contenido;
    }

    public String getPais() {
        return pais;
    }

    @Override
    public String toString() {
        return "Saludos{" +
                "id=" + id +
                ", contenido='" + contenido + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }
}
