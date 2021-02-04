package producaodecarros;

public class Compacto extends Veiculo {
    private TipoVeiculo tipoVeiculo;
    private String pacoteDeOpcionais;

    public Compacto(TipoVeiculo tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public void criar() {
        montar(TipoVeiculo.KWID.name());
        pintar();
        abastecer();
    }

    public String exibirInfo() {
        if (tipoVeiculo == TipoVeiculo.KWID) {
            criar();
            System.out.println("Com pacote de opcionais: " + getPacoteDeOpcionais());
            return "Pronto";
        } else {
            return "" + TipoVeiculo.INVALIDO;
        }
    }

    public TipoVeiculo getTipoVeiculo() {
        return tipoVeiculo;
    }

    public String getPacoteDeOpcionais() {
        return pacoteDeOpcionais;
    };

    public void setpacoteDeOpcionais(String pacoteDeOpcionais) {
        this.pacoteDeOpcionais = pacoteDeOpcionais;
    }
}
