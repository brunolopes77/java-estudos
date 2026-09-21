package PooFaculdade.ExercicioRevisaoPoo;

public class Main{
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

        carro.exibirDados();

        System.out.println("Portas: " + carro.getQuantidadePortas());

        System.out.println();

        moto.exibirDados();

        System.out.println("Partida elétrica: " + moto.isPossuiPartidaEletrica());
    }
}
