package producaodecarros;

public abstract class Veiculo {
    private int numeroDePortas;
    private String cor;
    private String combustivel;

    public void montar(String nome) {
        System.out.println("Montado um " + nome + "...");
        System.out.println("Com " + numeroDePortas + " portas...");
    }

    public void pintar() {
        System.out.println("Pintando da cor " + cor + "...");
    }

    public void abastecer() {
        System.out.println("Abastecendo com " + combustivel + "...");
    }

    protected void setNumeroDePortas(int portas) {
        this.numeroDePortas = portas;
    }

    protected int getnumeroDePortas() {
        return this.numeroDePortas;
    }

    protected void setCor(String cor) {
        this.cor = cor;
    }

    protected String getCor() {
        return this.cor;
    }

    protected void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    protected String getCombustivel() {
        return this.combustivel;
    }

}
