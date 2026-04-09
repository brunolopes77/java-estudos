package javacore.Gassociacao.domain;

public class Time {
    private String nome;
    private String sub;

    public Time(String nome,String sub) {
        this.nome = nome;
        this.sub = sub;
    }

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
