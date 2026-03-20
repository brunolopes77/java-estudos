package javacore.Introducaometodos.dominio;

public class Calculadora {
    public void somarDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void diminuirDoisnumeros() {
        System.out.println(21 - 2);
    }

    public void multiplicarDoisNumeros(int num1, int num2) {//parametros
        System.out.println(num1 * num2);
    }
    public double dividirDoisNumeros(double num1,double num2){
        if (num2 == 0){
            return 0;
        }
        return(num1/num2);
    }
    public void imprimiDoisNumeros(double num1,double num2){
        if (num2 == 0){
            System.out.println("Nao existe divisao por zero");
            return;//como se fosse um break
        }
        System.out.println(num1/num2);
    }
    public void imprimiDoisNumeros02 (int num1,int num2) {
        num1 = 1;
        num2 = 2;
        System.out.println(num1);
        System.out.println(num2);
    }
    public void somaVarArgs(int... numeros){
        int soma = 0;
        for (int num :numeros){
            soma += num;
        }
        System.out.println(soma);
    }

}
