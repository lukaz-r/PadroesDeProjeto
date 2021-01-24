package abstractfactory;

public class LojaVeiculo {
    VeiculoFactory veiculoFactory;

    public LojaVeiculo(VeiculoFactory veiculo) {
        this.veiculoFactory = veiculo;
    }

    public Veiculo venderVeiculo(String tipo) {
        Veiculo novo_Veiculo;
        novo_Veiculo = veiculoFactory.criarVeiculo(tipo);

        novo_Veiculo.printNome();
        novo_Veiculo.printCor();
        novo_Veiculo.printLugares();
        novo_Veiculo.printPeso();

        return novo_Veiculo;
    }
}
