package abstractfactory;

public class Cliente {

    public static void main(String[] args) {
        System.out.println("////////////////////////////////");
        System.out.println();

        VeiculoFactory factory = new VeiculoFactory();
        LojaVeiculo vel = new LojaVeiculo(factory);

        vel.venderVeiculo("SUV");
        System.out.println();
        vel.venderVeiculo("Hatch");

        System.out.println();
        System.out.println("////////////////////////////////");

    }
}
