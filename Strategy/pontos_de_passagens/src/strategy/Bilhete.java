package strategy;

public class Bilhete {
    public String classe;

    // Construtor que captura a classe

    public Bilhete(String classe) {
        this.classe = classe;
    }

    // metodo retorna classe do voo

    public StrategyPontuacao getEstrategiaDePontuacao(boolean isPassageiroDiamante) {
        if (isPrimeiraClasse() && isPassageiroDiamante) {
            return new StrategyPrimeiraClasseDiamante();
        } else if (isPrimeiraClasse()) {
            return new StrategyPrimeiraClasse();
        } else if (isClasseEconomica()) {
            return new StrategyClasseEconômica();
        } else {
            return new StrategyPromocional();
        }
    }

    // Métodos das classes de voo

    public boolean isPrimeiraClasse() {
        if (this.classe.equals("PC"))
            return true;

        return false;
    }

    public boolean isPromocional() {
        if (this.classe.equals("P"))
            return true;

        return false;
    }

    public boolean isClasseEconomica() {
        if (this.classe.equals("CE"))
            return true;

        return false;
    }
}
