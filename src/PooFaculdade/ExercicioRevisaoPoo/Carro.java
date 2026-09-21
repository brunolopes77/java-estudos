package PooFaculdade.ExercicioRevisaoPoo;

public class Carro extends Veiculo {

        private int quantidadePortas;

        public Carro(String marca, String modelo, int ano, double velocidadeAtual, int quantidadePortas) {
            super(marca, modelo, ano, velocidadeAtual);
            setQuantidadePortas(quantidadePortas);
        }

        public int getQuantidadePortas() {
            return quantidadePortas;
        }

        public void setQuantidadePortas(int quantidadePortas) {
            if (quantidadePortas > 0) {
                this.quantidadePortas = quantidadePortas;
            } else {
                throw new IllegalArgumentException("Quantidade de portas inválida.");
            }
        }
}

