package strategy;

public class StrategyPromocional implements StrategyPontuacao {
    public int calcularPontuacao(int distanciaDeVoo) {
        return distanciaDeVoo / 10;
    }
}
