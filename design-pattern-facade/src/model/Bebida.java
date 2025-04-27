package model;  // Pacote onde está a classe Bebida

public class Bebida implements ItemCombo {
    private String nome;
    private double preco;

    public Bebida(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return nome + " R$" + preco;
    }

    // Métodos estáticos para facilitar a criação de bebidas específicas
    public static Bebida refrigerante() {
        return new Bebida("Refrigerante", 5.99);
    }
}
