package PooFaculdade.ExercicioRevisaoPoo;

public class Main {
    public static void main(String[] args) {

        Veiculo[] frota = new Veiculo[3];

        frota[0] = new Carro("Toyota", "Corolla", 2025, 0, 4);
        frota[1] = new Moto("Honda", "CG 160", 2024, 0, true);
        frota[2] = new Carro("Volkswagen", "Golf", 2023, 0, 4);

        for (Veiculo veiculo : frota) {
            veiculo.exibirDados();
            System.out.println();
        }
    }
}
