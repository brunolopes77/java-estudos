package POO.Introducaometodos.Test;

import POO.Introducaometodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Bruno";
        estudante01.idade = "18";
        estudante01.sexo = 'M';

        estudante02.nome = "Joao";
        estudante02.idade = "19";
        estudante02.sexo = 'M';

        estudante01.imprime();

        System.out.println("---------------");

        estudante02.imprime();
    }
}
