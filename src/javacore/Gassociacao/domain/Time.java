package javacore.Gassociacao.domain;

public class Time {
    private String nome;
    private String sub;
    private Jogador[] jogadores;

    public Time(String nome,String sub) {
        this.nome = nome;
        this.sub = sub;
    }

    public Time(Jogador[] jogadores, String sub, String nome) {
        this.jogadores = jogadores;
        this.sub = sub;
        this.nome = nome;
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
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
