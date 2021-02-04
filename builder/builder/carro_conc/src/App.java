import builder.carro_conc.src.carro_con.ConcessionariaDirector;

public class App {
    public static void main(String[] args) throws Exception {
        ConcessionariaDirector concessionariaDirector = new ConcessionariaDirector(new FiatBuilder());

        concessionaria.construirCarro();

        CarroProduct carro = concessionaria.getCarro();

        System.out.println(carro.modelo + carro.montadora);

        System.out.println();
    }
}
