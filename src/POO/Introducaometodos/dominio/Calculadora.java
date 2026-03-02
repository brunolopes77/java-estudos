package POO.Introducaometodos.dominio;

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
}
