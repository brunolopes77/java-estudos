package javacore.Bintroducaometodos.Test;


import javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.dividirDoisNumeros(20,0);
        System.out.println(result);
        System.out.println("----------------");
        calculadora.imprimiDoisNumeros(20,0);
    }
}
