package JavaBasicoExercicios.ExerciciosComplementares;

public class CalculoDeFatorial {
    public static void main(String[] args) {
        int numeroFatorial = 1;
        int resultMultiplicacao = numeroFatorial * (numeroFatorial - 1);

        if (numeroFatorial <= 3 && numeroFatorial >= 2) {
            System.out.println(resultMultiplicacao);
        } else if (numeroFatorial == 1) {
            System.out.println(numeroFatorial);
        } else {
            for (int i = numeroFatorial - 2; i > 1; i--) {
                resultMultiplicacao = resultMultiplicacao * i;
                if (i == 2) {
                    System.out.println(resultMultiplicacao);
                }
            }
        }
    }
}
