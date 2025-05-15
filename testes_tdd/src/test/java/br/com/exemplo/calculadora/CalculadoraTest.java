package br.com.exemplo.calculadora;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Testes da Calculadora")
class CalculadoraTest {

    @Test
    @DisplayName("Somar dois números deve retornar a soma")
    void somar_doisNumeros_deveRetornarSoma() {
        Calculadora calc = new Calculadora();
        assertEquals(5, calc.somar(2, 3));
    }

    @Test
    @DisplayName("Subtrair dois números deve retornar a diferença")
    void subtrair_doisNumeros_deveRetornarDiferenca() {
        Calculadora calc = new Calculadora();
        assertEquals(1, calc.subtrair(4, 3));
    }

    @Test
    @DisplayName("Multiplicar dois números deve retornar o produto")
    void multiplicar_doisNumeros_deveRetornarProduto() {
        Calculadora calc = new Calculadora();
        assertEquals(12, calc.multiplicar(4, 3));
    }

    @Test
    @DisplayName("Dividir dois números deve retornar o quociente")
    void dividir_doisNumeros_deveRetornarQuociente() {
        Calculadora calc = new Calculadora();
        assertEquals(2, calc.dividir(10, 5));
    }

    @Test
    @DisplayName("Dividir por zero deve lançar exceção")
    void dividir_divisorZero_deveLancarExcecao() {
        Calculadora calc = new Calculadora();
        assertThrows(IllegalArgumentException.class,
                () -> calc.dividir(10, 0),
                "Dividir por zero deveria lançar IllegalArgumentException");
    }
}
