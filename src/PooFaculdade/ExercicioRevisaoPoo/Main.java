package PooFaculdade.ExercicioRevisaoPoo;

public class Main {
    public static void main(String[] args) {

        Veiculo veiculo = new Carro(
                "Toyota",
                "Corolla",
                2025,
                0,
                4
        );

        veiculo.realizarManutencao();
    }
}

