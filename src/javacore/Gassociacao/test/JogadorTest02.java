package javacore.Gassociacao.test;

import javacore.Gassociacao.domain.Jogador;
import javacore.Gassociacao.domain.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Neymar");
        Time time = new Time("Brasil", "sub17");

        jogador1.setTime(time);
        jogador1.imprime();
    }
}

