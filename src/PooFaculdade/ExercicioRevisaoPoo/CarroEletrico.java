package PooFaculdade.ExercicioRevisaoPoo;

public class CarroEletrico extends Carro implements Eletrico, Conectavel, Rastreavel{

    private int nivelBateria;

    public CarroEletrico(String marca, String modelo, int ano,
                         double velocidadeAtual, int quantidadePortas) {

        super(marca, modelo, ano, velocidadeAtual, quantidadePortas);
        nivelBateria = 0;
    }

    @Override
    public void carregarBateria() {
        nivelBateria = 100;
    }

    @Override
    public int getNivelBateria() {
        return nivelBateria;
    }
    @Override
    public void conectarInternet() {
        System.out.println("Veículo conectado.");
    }
    @Override
    public String obterLocalizacao() {
        return "Brasília-DF";
    }
}
