package producaodecarros;

public class Pickup extends Veiculo {

    private TipoVeiculo tipoVeiculo;
    private double volumeDeCacamba;

    public Pickup(TipoVeiculo tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public void criar() {
        montar(TipoVeiculo.RAM.name());
        pintar();
        abastecer();
    }

    public String exibirInfo() {
        if (tipoVeiculo == TipoVeiculo.RAM) {
            criar();
            System.out.println("Com volume de caçamba de: " + getVolumeDeCacamba() + " Litros");
            return "Pronto";
        } else {
            return "" + TipoVeiculo.INVALIDO;
        }
    }

    public TipoVeiculo getTipoVeiculo() {
        return tipoVeiculo;
    }

    public double getVolumeDeCacamba() {
        return volumeDeCacamba;
    }

    public void setVolumeDeCacamba(double volumeDeCacamba) {
        this.volumeDeCacamba = volumeDeCacamba;
    }
}
