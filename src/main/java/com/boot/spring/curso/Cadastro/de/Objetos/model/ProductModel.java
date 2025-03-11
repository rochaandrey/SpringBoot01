package com.boot.spring.curso.Cadastro.de.Objetos.model;

import jakarta.persistence.*;

@Entity
@Table(name = "solta_a_carta_caralho")
public class ProductModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;

    public ProductModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public ProductModel() {
    }

}
