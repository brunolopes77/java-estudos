package PooFaculdade.ExercicioRevisaoPoo;

public  abstract class Veiculo {

    private String marca;
    private String modelo;
    private int ano;
    private double velocidadeAtual;

    public Veiculo(String marca, String modelo, int ano, double velocidadeAtual) {
        setMarca(marca);
        setModelo(modelo);
        setAno(ano);
        setVelocidadeAtual(velocidadeAtual);
    }


    public void exibirDados() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Velocidade: " + velocidadeAtual + " km/h");
    }

    public abstract void realizarManutencao();

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

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    protected void setVelocidadeAtual(double velocidadeAtual) {
        if (velocidadeAtual >= 0) {
            this.velocidadeAtual = velocidadeAtual;
        } else {
            throw new IllegalArgumentException("Velocidade negativa não pode ser declarada.");
        }
    }

    public void acelerar(double valor) {
        if (valor >= 0) {
            setVelocidadeAtual(velocidadeAtual + valor);
        } else {
            throw new IllegalArgumentException("Falha");
        }
    }

    public void frear(double valor) {
        if (valor >= 0) {
            setVelocidadeAtual(velocidadeAtual - valor);
        } else {
            throw new IllegalArgumentException("Falha");
        }
    }
}
