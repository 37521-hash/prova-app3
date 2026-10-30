package locadora.model;

public abstract class Veiculo {

    private final String placa;
    private final String modelo;
    private final double valorDiaria;

    protected Veiculo(String placa, String modelo, double valorDiaria) {
        this.placa = placa;
        this.modelo = modelo;
        this.valorDiaria = valorDiaria;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public abstract double calcularAluguel(int dias);

    public void imprimirResumo() {
        System.out.println(getClass().getSimpleName()
                + " | Modelo: " + modelo
                + " | Placa: " + placa
                + " | Diária: R$ " + valorDiaria);
    }
}