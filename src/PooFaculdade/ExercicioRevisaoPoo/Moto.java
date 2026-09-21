package PooFaculdade.ExercicioRevisaoPoo;


public class Moto extends Veiculo {

        private boolean possuiPartidaEletrica;

        public Moto(String marca, String modelo, int ano, double velocidadeAtual, boolean possuiPartidaEletrica) {
            super(marca, modelo, ano, velocidadeAtual);
            setPossuiPartidaEletrica(possuiPartidaEletrica);
        }

        public boolean isPossuiPartidaEletrica() {
            return possuiPartidaEletrica;
        }

        public void setPossuiPartidaEletrica(boolean possuiPartidaEletrica) {
            this.possuiPartidaEletrica = possuiPartidaEletrica;
        }
}

