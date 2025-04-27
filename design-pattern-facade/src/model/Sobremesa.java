package model;  // Pacote onde está a classe Sobremesa

public class Sobremesa implements ItemCombo {
    private String nome;
    private double preco;

    public Sobremesa(String nome, double preco) {
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

    // Métodos estáticos para criar sobremesas específicas
    public static Sobremesa sundae() {
        return new Sobremesa("Sundae", 7.49);
    }
}
