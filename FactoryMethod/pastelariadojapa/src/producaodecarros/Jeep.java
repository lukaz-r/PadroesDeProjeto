package producaodecarros;

public class Jeep implements VeiculoFactory {

    @Override
    public SUV criarVeiculo(TipoVeiculo tv) {
        return new SUV(tv);
    }
}
