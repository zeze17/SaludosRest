package com.example.SaludosRest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class SaludosControllador {
    private  static final String template= "Como vamos %s!";
    private  final AtomicLong counter = new AtomicLong();
    private String country= "Republica de Colombia";
    @GetMapping("/saludos")
    public Saludos saludos(@RequestParam(value = "nombre", defaultValue = "Mundo") String nombre){

        return new Saludos(counter.incrementAndGet(),String.format(template,nombre),country);

    }


}
