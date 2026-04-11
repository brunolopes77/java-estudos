package javacore.Gassociacao.test;

import javacore.Gassociacao.domain.Escola;
import javacore.Gassociacao.domain.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Bruno");
        Professor professor2 = new Professor("Vasconcelos");
        Professor[] professores = {professor1,professor2};

        Escola escola = new Escola("Delta", professores);

        escola.imprime();
    }
}
