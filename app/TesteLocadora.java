package locadora.app;

import java.util.ArrayList;
import java.util.List;

import locadora.model.Carro;
import locadora.model.CarroEletrico;
import locadora.model.Eletrico;
import locadora.model.Moto;
import locadora.model.Veiculo;

public class TesteLocadora {

    public static void main(String[] args) {

        System.out.println("=== Estrada Livre - Locadora de Veículos ===\n");

        // Veiculo v = new Veiculo("AAA-0000", "Genérico", 100.0); // Não compila: Veiculo é abstrata e não pode ser instanciada.

        Carro carro = new Carro("ABC-1234", "Onix", 150.0);
        Moto moto = new Moto("MOT-5678", "CG 160", 80.0);
        CarroEletrico eletrico = new CarroEletrico("ELE-9012", "Dolphin", 200.0);

        List<Veiculo> frota = new ArrayList<>();
        frota.add(carro);
        frota.add(moto);
        frota.add(eletrico);

        int dias = 3;
        System.out.println("--- Frota: aluguel por " + dias + " dias ---");
        for (Veiculo v : frota) {
            v.imprimirResumo();
            System.out.println("Aluguel (" + dias + " dias): R$ " + v.calcularAluguel(dias));
            System.out.println();
        }

        System.out.println("--- Recarga (apenas tipo Eletrico) ---");
        List<Eletrico> eletricos = new ArrayList<>();
        eletricos.add(eletrico);
        for (Eletrico e : eletricos) {
            System.out.println("Recarga (3 dias, 10 kWh/dia): R$ " + e.calcularRecarga(3, 10.0));
        }

        System.out.println("\n--- Verificação dos valores esperados ---");
        System.out.println("Carro (150/dia, 3 dias): " + carro.calcularAluguel(3));            // 495.0
        System.out.println("Moto (80/dia, 4 dias): " + moto.calcularAluguel(4));               // 320.0
        System.out.println("Moto (80/dia, 5 dias): " + moto.calcularAluguel(5));               // 340.0
        System.out.println("Carro Elétrico (200/dia, 3 dias): " + eletrico.calcularAluguel(3)  // 705.0
                + " | Recarga: " + eletrico.calcularRecarga(3, 10.0));                         // 24.0
    }
}