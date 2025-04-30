package strategy;

public class Aritmetica implements MediaStrategy {

    @Override
    public double calcularMedia(double p1, double p2) {
        return (p1 + p2) / 2;
    }

    @Override
    public String verificarSituacao(double media) {
       return media >= 5 ? "Aprovado" : "Reprovado";
    }
}
