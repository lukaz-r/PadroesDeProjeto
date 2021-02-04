package producaodecarros;

public class App {
    public static void main(String[] args) throws Exception {
        Jeep jeep = new Jeep();
        SUV suv = jeep.criarVeiculo(TipoVeiculo.RENEGADE);
        suv.setCor("Preto");
        suv.setNumeroDePortas(4);
        suv.setCapacidadeDeCarga(1500.0);
        suv.setCombustivel("Diesel");
        System.out.println();
        suv.exibirInfo();
        System.out.println("-----------------");

        Dodge dodge = new Dodge();
        Pickup pickup = dodge.criarVeiculo(TipoVeiculo.RAM);
        pickup.setCombustivel("Gasolina");
        pickup.setCor("Marrom");
        pickup.setNumeroDePortas(5);
        pickup.setVolumeDeCacamba(3.000);
        System.out.println();
        pickup.exibirInfo();
        System.out.println("-----------------");

        Renault renault = new Renault();
        Compacto compacto = renault.criarVeiculo(TipoVeiculo.KWID);
        compacto.setCombustivel("Etanol");
        compacto.setCor("Rosa");
        compacto.setNumeroDePortas(3);
        compacto.setpacoteDeOpcionais("Basico");
        System.out.println();
        compacto.exibirInfo();
        System.out.println("-----------------");
    }

}
