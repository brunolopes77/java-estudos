package JavaBasicoExercicios;

public class Ex09_ImprimirAteUmCertoNumero {
    public static void main(String[] args) {
        //imprimir os 25 primeiros numeros
        int maxValue = 50;
        for (int i = 0; i < maxValue; i++) {
            if (i > 25) {
                break;
            }
            System.out.println(i);
        }
    }
}
