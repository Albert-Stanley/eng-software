package model;  // Pacote onde está a classe Combo

public class Combo {
    private ItemCombo burger;
    private ItemCombo bebida;
    private ItemCombo sobremesa;

    public Combo(ItemCombo burger, ItemCombo bebida, ItemCombo sobremesa) {
        this.burger = burger;
        this.bebida = bebida;
        this.sobremesa = sobremesa;
    }

    public double getPrecoTotal() {
        return burger.getPreco() + bebida.getPreco() + sobremesa.getPreco();
    }

    public void getItens() {
        System.out.println(burger.getNome() + " - R$ " + burger.getPreco());
        System.out.println(bebida.getNome() + " - R$ " + bebida.getPreco());
        System.out.println(sobremesa.getNome() + " - R$ " + sobremesa.getPreco());
    }
}
