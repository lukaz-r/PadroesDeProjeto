package abstractfactory;

public class Veiculo {
    String nome;
    String cor;
    int n_Lugares;
    float peso;

    public void printNome() {
        System.out.println("Veiculo: " + nome);
    }

    public void printCor() {
        System.out.println("Cor escolhida: " + cor);
    }

    public void printLugares() {
        System.out.println("Comporta até: " + n_Lugares + " Pessoas");
    }

    public void printPeso() {
        System.out.println("Pesa o equivalente a: " + peso + "Kg");
    }
}
