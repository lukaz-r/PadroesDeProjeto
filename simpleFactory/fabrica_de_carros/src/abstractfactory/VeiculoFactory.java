package abstractfactory;

public class VeiculoFactory {
    public Veiculo criarVeiculo(String tipo) {
        Veiculo veiculo = null;

        if (tipo.equals("Sedan")) {
            veiculo = new VeiculoSedan();
        } else if (tipo.equals("SUV")) {
            veiculo = new VeiculoSUV();
        } else if (tipo.equals("Hatch")) {
            veiculo = new VeiculoHatch();
        } else {
            System.out.println("Veiculo não encontrado/disponivel");
            veiculo = null;
        }

        return veiculo;
    }
}
