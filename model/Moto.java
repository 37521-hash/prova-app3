package locadora.model;

public class Moto extends Veiculo {

    private static final int DIAS_PARA_DESCONTO = 5;
    private static final double DESCONTO = 0.15;

    public Moto(String placa, String modelo, double valorDiaria) {
        super(placa, modelo, valorDiaria);
    }

    @Override
    public double calcularAluguel(int dias) {
        double total = getValorDiaria() * dias;
        if (dias >= DIAS_PARA_DESCONTO) {
            total -= total * DESCONTO;
        }
        return total;
    }
}