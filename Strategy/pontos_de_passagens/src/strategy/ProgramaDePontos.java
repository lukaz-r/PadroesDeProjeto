package strategy;

import java.util.ArrayList;

// Classe context, que trata e retorna a pontuação do passageiro

public class ProgramaDePontos {
    public int calcularPontuacao(Passageiro passageiro) {
        int totalDePontos = 0;

        ArrayList<Voo> voosPendentes = passageiro.getVoosComPontuacao();

        for (Voo voo : voosPendentes) {
            Bilhete bilhete = passageiro.getBilhete(voo.getNumero());
            StrategyPontuacao estrategia = bilhete.getEstrategiaDePontuacao(passageiro.isDiamante());

            totalDePontos += estrategia.calcularPontuacao(voo.getDistancia());
        }

        passageiro.atualizarPontuacao(totalDePontos);
        passageiro.marcarVoosComoProcessados();

        return totalDePontos;
    }
}
