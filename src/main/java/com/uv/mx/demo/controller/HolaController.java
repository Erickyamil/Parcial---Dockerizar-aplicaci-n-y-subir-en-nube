package com.uv.mx.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController {

    @GetMapping("/hola")
    public String hola() {
        return "Este es un mensaje que dice:<br>Hola! - (hecho con Spring Boot)" +
        "<br>Erick Yamil Rodríguez Castellanos - S23017379" +
        "<br>Calificación esperada: lo q sea es bueno/10";
    }
}