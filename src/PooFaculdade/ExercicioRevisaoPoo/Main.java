package PooFaculdade.ExercicioRevisaoPoo;

public class Main {

    public static void main(String[] args) {

        Eletrico eletrico = new CarroEletrico(
                "Tesla",
                "Model 3",
                2025,
                0,
                4
        );

        eletrico.carregarBateria();

        System.out.println(eletrico.getNivelBateria());
    }
}

