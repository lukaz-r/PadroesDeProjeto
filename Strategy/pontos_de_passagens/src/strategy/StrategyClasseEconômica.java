package strategy;

public class StrategyClasseEconômica implements StrategyPontuacao {
    public int calcularPontuacao(int distanciaDeVoo) {
        return distanciaDeVoo / 4;
    }
}
