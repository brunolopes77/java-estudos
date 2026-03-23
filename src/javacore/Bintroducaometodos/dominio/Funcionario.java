package javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private float[] salarios;
    private float media;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salarios == null) {
            return;
        }
        for (float salario : this.salarios) {
            System.out.println(salario);
        }
        imprimeMediaASalarial();
    }

    public void imprimeMediaASalarial() {
        if (salarios == null) {
            return;
        }

        for (float salario : this.salarios) {
            media += salario;
        }
        media /= salarios.length;
        System.out.println(media);

    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getMedia() {
        return media;
    }

    public float[] getSalarios() {
        return salarios;
    }

    public void setSalarios(float[] salarios) {
        this.salarios = salarios;
    }
}
