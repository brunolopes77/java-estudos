package PooFaculdade.ExercicioRevisaoPoo;

public class CarroEletrico extends Carro implements Eletrico {

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
}
