package JavaBasicoExercicios.FixacaoDaAula;

public class Ex08_ImprimirNumerosPares {
    public static void main(String[] args) {
        //Imprimir numeros pares de 1 ate 1000000
        for (long i = 0; i <= 1000000; i++) {
            if (i % 2 == 0) {
                System.out.println("O número "+i+ " é par");
            }
        }
    }
}
