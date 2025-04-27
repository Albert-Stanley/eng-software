package facade;

import model.Bebida;
import model.Burger;
import model.Combo;
import model.Sobremesa;

public class ComboFacade {

    // Método que cria o combo com base no código do combo escolhido
    public Combo criarCombo(int codigo) {
        switch (codigo) {
            case 1: // Combo Master
                return new Combo(
                        Burger.bigCheddar(),  // Burger
                        Bebida.refrigerante(), // Bebida
                        Sobremesa.sundae()     // Sobremesa
                );
            case 2: // Super Combo
                return new Combo(
                        new Burger("Cheeseburger", 14.99), // Burger
                        new Bebida("Suco de Laranja", 6.50), // Bebida
                        new Sobremesa("Brownie", 8.99) // Sobremesa
                );
            default:
                System.out.println("Opção inválida. Escolha um combo válido.");
                return null;
        }
    }

    // Exibe os itens do combo (nome e preço)
    public void exibirItens(Combo combo) {
        if (combo != null) {
            combo.getItens();
        }
    }

    // Calcula o preço total do combo
    public double getPrecoTotal(Combo combo) {
        return (combo != null) ? combo.getPrecoTotal() : 0.0;
    }
}
