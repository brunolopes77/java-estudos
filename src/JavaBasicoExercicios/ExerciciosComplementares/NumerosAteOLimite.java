package JavaBasicoExercicios.ExerciciosComplementares;

public class NumerosAteOLimite {
    // Peça um número inteiro.
    // Mostre todos os números pares de 1 até ele.
    // Se o número for negativo, informe que não é permitido.
    public static void main(String[] args) {
        int number = 23;
        if (number < 0) {
            System.out.println("Número inválido");
        } else {
            for (int even = 1; even <= number; even++) {
                if (even % 2 == 0) {
                    System.out.println(even);
                }
            }
        }
    }
}
