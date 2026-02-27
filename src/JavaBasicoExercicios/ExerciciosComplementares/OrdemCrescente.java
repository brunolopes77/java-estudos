package JavaBasicoExercicios.ExerciciosComplementares;

public class OrdemCrescente {
    public static void main(String[] args) {
        int[] numeros = {4, 7, 3, 8, 2};
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = i + 1; j < numeros.length ; j++) {
                if (numeros[i] > numeros[j]) {
                    int mediadorDeTroca;
                    mediadorDeTroca = numeros[j];
                    numeros[j] = numeros[i];
                    numeros[i] = mediadorDeTroca;
                }
            }
        }
        for (int i : numeros) {
            System.out.print(i);
        }
    }
}