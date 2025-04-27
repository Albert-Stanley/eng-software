package app;

import java.util.Scanner;
import facade.ComboFacade;
import model.Combo;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("=== Menu de Combos ===");
        System.out.println("1 – Combo Master");
        System.out.println("2 – Super Combo");
        System.out.print("Sua escolha: ");
        int escolha = in.nextInt();

        // Criação do objeto ComboFacade
        ComboFacade facade = new ComboFacade();
        Combo combo = facade.criarCombo(escolha);  // Criando o combo com base na escolha

        if (combo != null) {
            facade.exibirItens(combo);  // Exibindo os itens do combo
            System.out.printf("Total a pagar: R$ %.2f%n", facade.getPrecoTotal(combo));  // Exibindo o total
        }

        in.close();  // Fechar o scanner
    }
}
