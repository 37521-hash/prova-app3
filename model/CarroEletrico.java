package locadora.model;

public class CarroEletrico extends Carro implements Eletrico {

    private static final double TAXA_BATERIA_DIARIA = 15.00;
    private static final double VALOR_KWH = 0.80;

    public CarroEletrico(String placa, String modelo, double valorDiaria) {
        super(placa, modelo, valorDiaria);
    }

    @Override
    public double calcularAluguel(int dias) {
        return super.calcularAluguel(dias) + (TAXA_BATERIA_DIARIA * dias);
    }

    @Override
    public double calcularRecarga(int dias, double consumoKWhDiario) {
        return dias * consumoKWhDiario * VALOR_KWH;
    }
}