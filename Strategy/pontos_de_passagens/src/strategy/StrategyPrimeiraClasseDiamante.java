package strategy;

public class StrategyPrimeiraClasseDiamante implements StrategyPontuacao {
    public int calcularPontuacao(int distanciaDeVoo) {
        return distanciaDeVoo;
    }
}
