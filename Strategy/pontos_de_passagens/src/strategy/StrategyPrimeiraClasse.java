package strategy;

public class StrategyPrimeiraClasse implements StrategyPontuacao {
    public int calcularPontuacao(int distanciaDeVoo) {
        return distanciaDeVoo / 2;
    }
}
