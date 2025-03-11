package com.boot.spring.curso.Cadastro.de.Objetos.Product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ProductController {

    @GetMapping("/welcome")
    public String welcome(){
        return "rota";
    }
}
