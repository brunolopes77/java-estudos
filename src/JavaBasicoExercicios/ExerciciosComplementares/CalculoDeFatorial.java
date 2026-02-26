package JavaBasicoExercicios.ExerciciosComplementares;

public class CalculoDeFatorial {
    public static void main(String[] args) {
        int fatorial = 8;
        long resultado = 1;
        for (int i = 1; i <= fatorial; i++) {
            resultado *= i;
        }
        System.out.println(resultado);
    }
}
