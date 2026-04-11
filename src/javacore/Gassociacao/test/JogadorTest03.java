package javacore.Gassociacao.test;

import javacore.Gassociacao.domain.Jogador;
import javacore.Gassociacao.domain.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Neymar");
        Jogador[] jogadores = {jogador};
        Time time = new Time(jogadores,"sub 20", "Brasil");



    }
}
