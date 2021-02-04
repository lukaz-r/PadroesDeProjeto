package builder.carro_conc.src.carro_con;

public class VolksBuilder extends CarroBuilder {
    @Override
    public void buildPreco() {
        carro.preco = 1000.00;
    }

    @Override
    public void buildDscMotor() {
        carro.dscMotor = '1.0 flex';
    }

    @Override
    public void buildModelo() {
        // TODO Auto-generated method stub

    }

}
