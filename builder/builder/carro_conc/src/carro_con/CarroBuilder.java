package builder.carro_conc.src.carro_con;

public abstract class CarroBuilder {
    protected CarroProduct carro;

    public CarroBuilder(CarroBuilder carro) {
        carro = new CarroProduct();
    }

    public abstract void buildPreco();

    public abstract void buildDscMotor();

    public abstract void buildAnoDeFabricacao();

    public abstract void buildModelo();

    public abstract void buildMontadora();

}
