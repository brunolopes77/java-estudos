package javacore.Introducaometodos.Test;

import javacore.Introducaometodos.dominio.Estudante;
import javacore.Introducaometodos.dominio.ImprimeEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImprimeEstudante imprimeEstudante = new ImprimeEstudante();

        estudante01.nome = "Bruno";
        estudante01.idade = "18";
        estudante01.sexo = 'M';

        estudante02.nome = "Joao";
        estudante02.idade = "19";
        estudante02.sexo = 'M';

        imprimeEstudante.imprime(estudante01);

        System.out.println("----------------------");

        imprimeEstudante.imprime(estudante02);

        System.out.println("------------------------------");

        System.out.println(estudante01.nome);

    }
}
