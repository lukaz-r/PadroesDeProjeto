package strategy;

import java.util.ArrayList;

public class Passageiro {

    int totalDePontos = 0;
    boolean diamante = false;

    ArrayList<Voo> voos;
    ArrayList<Bilhete> bilhetes;
    ArrayList<Voo> voosPendentes;

    public ArrayList<Voo> getVoosComPontuacao() {

        voosPendentes.clear();

        for (Voo voo : voos) {
            if (voo.vooProcessado != true) {
                voosPendentes.add(voo);
            }
        }
        return voosPendentes;
    }

    public boolean isDiamante() {
        return this.diamante;
    }

    public void marcarVoosComoProcessados() {
        for (Voo voo : voos) {
            voo.vooProcessado = true;
        }
    }

    public void atualizarPontuacao(int totalDePontos) {
        this.totalDePontos = totalDePontos;
    }

    public Bilhete getBilhete(int numero) {
        return bilhetes.get(numero);
    }

    public void addBilhetes(Bilhete bilhete) {
        bilhetes.add(bilhete);
    }

}
