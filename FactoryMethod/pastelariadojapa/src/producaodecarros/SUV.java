package producaodecarros;

public class SUV extends Veiculo {

    private TipoVeiculo tipoVeiculo;
    private double capacidadeDeCarga;

    public SUV(TipoVeiculo tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public void criar() {
        montar(TipoVeiculo.RENEGADE.name());
        pintar();
        abastecer();
    }

    public String exibirInfo() {
        if (tipoVeiculo == TipoVeiculo.RENEGADE) {
            criar();
            System.out.println("Com capacidade de carga de: " + getCapacidadeDeCarga() + " KG");
            return "Pronto";
        } else {
            return "" + TipoVeiculo.INVALIDO;
        }
    }

    public TipoVeiculo getTipoVeiculo() {
        return tipoVeiculo;
    }

    protected double getCapacidadeDeCarga() {
        return capacidadeDeCarga;
    }

    protected void setCapacidadeDeCarga(double capacidadeDeCarga) {
        this.capacidadeDeCarga = capacidadeDeCarga;
    }

}
