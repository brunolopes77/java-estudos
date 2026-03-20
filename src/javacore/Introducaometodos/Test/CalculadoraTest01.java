package javacore.Introducaometodos.Test;

import javacore.Introducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somarDoisNumeros();
        System.out.println("------");
        calculadora.diminuirDoisnumeros();
        System.out.println("------");

    }
}
