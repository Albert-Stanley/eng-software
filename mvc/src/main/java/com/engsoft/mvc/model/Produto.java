package com.engsoft.mvc.model;

public class Produto {

    private Long id;
    private String nome;
    private String descricao;
    private double preco;
    private String imagemUrl;

    public Produto(Long id, String nome, String descricao, double preco, String imagemUrl) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.imagemUrl = imagemUrl;
    }

    // Getters
    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    public String getImagemUrl() {
        return imagemUrl;
    }
}
