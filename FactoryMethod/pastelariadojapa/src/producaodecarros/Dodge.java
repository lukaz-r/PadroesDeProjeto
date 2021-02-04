package producaodecarros;

public class Dodge implements VeiculoFactory {

    @Override
    public Pickup criarVeiculo(TipoVeiculo tv) {
        return new Pickup(tv);
    }

}
