package producaodecarros;

public class Renault implements VeiculoFactory {

    @Override
    public Compacto criarVeiculo(TipoVeiculo tv) {
        return new Compacto(tv);
    }

}
