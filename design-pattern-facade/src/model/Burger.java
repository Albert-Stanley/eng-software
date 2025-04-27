package model;


public class Burger implements ItemCombo{
    private String nome;
    private double preco;

    public Burger(String nome, double preco) {
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

    // Métodos estáticos para facilitar a criação de lanches específicos (como o Big Cheddar)
    public static Burger bigCheddar() {
        return new Burger("Big Cheddar", 19.99);
    }
}
