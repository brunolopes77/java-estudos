package POO.Introducaometodos.Test;

import POO.Introducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Bruno";
        funcionario.idade = 18;
        funcionario.salarios = new float[] {1540,1567,1580};


        funcionario.imprime();
    }
}
