package PooFaculdade.ExercicioRevisaoPoo;

public class Veiculo {

    private String marca;
    private String modelo;
    private int ano;
    private double velocidadeAtual;


    public void exibirDados() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Velocidade: " + velocidadeAtual + " km/h");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano >= 1886) {
            this.ano = ano;
        } else {
            throw new IllegalArgumentException("Ano inválido.");
        }

    }
    public double getVelocidadeAtual(){
        return velocidadeAtual;
    }

    private void setVelocidadeAtual(double velocidadeAtual) {
        if (velocidadeAtual >= 0) {
            this.velocidadeAtual = velocidadeAtual;
        } else {
            throw new IllegalArgumentException("Velocidade negativa não pode ser declarada.");
        }
    }
    public void acelerar (double valor){
        velocidadeAtual += valor;
    }


    public void frear(double valor) {
        velocidadeAtual -= valor;
    }
}
