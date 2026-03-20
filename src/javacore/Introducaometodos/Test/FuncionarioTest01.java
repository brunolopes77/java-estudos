package javacore.Introducaometodos.Test;

import javacore.Introducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Bruno");
        funcionario.setIdade(18);
        funcionario.setSalarios(new float[] {1540,1567,1580});

        funcionario.imprime();
    }
}
