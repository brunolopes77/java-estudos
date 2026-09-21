package PooFaculdade.ExercicioRevisaoPoo;

public class Main{
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo();
        Veiculo v2 = new Veiculo();

        v1.acelerar(-10);
        System.out.println(v1.getVelocidadeAtual());
    }
}
