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
    @Override
    public void exibirDados() {
        super.exibirDados();

        System.out.println("Possui partida elétrica: " + possuiPartidaEletrica);
    }
    @Override
    public void realizarManutencao() {
        System.out.println("Verificação da corrente e dos pneus.");
    }
}

