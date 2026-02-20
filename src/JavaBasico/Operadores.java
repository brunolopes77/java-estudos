package JavaBasico;

public class Operadores {
    public static void main(String[] args) {
        // + - / *
        int number01 = 10;
        int number02 = 20;
        int result1 = number01 + number02;//Numeros Inteiros
        double number03 = 20;
        int numeber04 = 30;
        double result2 = number03 / numeber04;//Numeros decimais (precisa de uma variavel decimal incluida na operacao ou fazer uma Cast)
        System.out.println(result1);
        System.out.println(result2);

        // %
        int remainder = 10 % 2;
        System.out.println(remainder);
        // < > <= >= == !=
        boolean isTenGreaterThanTwenty = 10 > 20;
        boolean isTenLessThanTwenty = 10 < 20;
        boolean isTenEqualToTwenty = 10 == 20;
        boolean isTenEqualToTen = 10 == 10;
        boolean isTenNotEqualToTen = 10 != 10;

        System.out.println(isTenGreaterThanTwenty);
        System.out.println(isTenLessThanTwenty);
        System.out.println(isTenEqualToTwenty);
        System.out.println(isTenEqualToTen);
        System.out.println(isTenNotEqualToTen);

    }
}
