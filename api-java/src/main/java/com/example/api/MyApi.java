package com.example.api;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.modelo.Datos;

@RestController
@RequestMapping("/api")

public class MyApi {
    @GetMapping("/datos")
    public Datos getData(){
        return new Datos(1, "Elemento 1", "Descripcion del elemento 1");
    }    
}
