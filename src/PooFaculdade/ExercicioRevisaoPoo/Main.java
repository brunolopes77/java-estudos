package PooFaculdade.ExercicioRevisaoPoo;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Carro carro = new Carro(
                "Toyota",
                "Corolla",
                2025,
                0,
                4
        );

        Moto moto = new Moto(
                "Honda",
                "CG 160",
                2024,
                0,
                true
        );


        CarroEletrico carroEletrico = new CarroEletrico(
                "Tesla",
                "Model 3",
                2025,
                0,
                4
        );



        List<Veiculo> frota = new ArrayList<>();

        frota.add(carro);
        frota.add(moto);
        frota.add(carroEletrico);


        for (Veiculo veiculo : frota) {

            veiculo.exibirDados();

            veiculo.realizarManutencao();


            if (veiculo instanceof Eletrico) {

                Eletrico eletrico = (Eletrico) veiculo;

                eletrico.carregarBateria();

                System.out.println(
                        "Nível da bateria: "
                                + eletrico.getNivelBateria()
                                + "%"
                );
            }

            System.out.println("-------------------------");
        }


        try {

            Carro carroTeste = new Carro(
                    "Ford",
                    "Ka",
                    2025,
                    -10,
                    4
            );

        } catch (IllegalArgumentException e) {

            System.out.println(
                    "Validação funcionando: "
                            + e.getMessage()
            );
        }


        try {

            carro.acelerar(-20);

        } catch (IllegalArgumentException e) {

            System.out.println(
                    "Validação funcionando: "
                            + e.getMessage()
            );
        }
    }
}

