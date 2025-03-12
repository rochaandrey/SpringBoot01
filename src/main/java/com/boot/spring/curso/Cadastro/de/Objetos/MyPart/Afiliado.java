package com.boot.spring.curso.Cadastro.de.Objetos.MyPart;

import com.boot.spring.curso.Cadastro.de.Objetos.Product.model.ProductModel;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tigrinho_filha_da_puta")
public class Afiliado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="nome", nullable = false)
    private String nome;

    @Column(name = "produtos", nullable = true)
    private List<ProductModel> produtos = new ArrayList();
}
