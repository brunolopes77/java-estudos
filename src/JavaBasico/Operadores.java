package JavaBasico;

public class Operadores {
    public static void main(String[] args) {
        // + - / *
        int number01 = 10;
        int number02 = 20;
        int result1 = number01 + number02;//Numeros Inteiros
        double number03 = 20;
        int number04 = 30;
        double result2 = number03 / number04;//Numeros decimais (precisa de uma variavel decimal incluida na operacao ou fazer um Cast)
        System.out.println(result1);
        System.out.println(result2);
        System.out.println("---------------------------------------------------------------");

        // %
        int remainder = 10 % 2;
        System.out.println(remainder);
        // < > <= >= == !=
        boolean isTenGreaterThanTwenty = 10 > 20;
        boolean isTenLessThanTwenty = 10 < 20;
        boolean isTenEqualToTwenty = 10 == 20;
        boolean isTenEqualToTen = 10 == 10;
        boolean isTenNotEqualToTen = 10 != 10;
        boolean isTenSeven = 10 >= 7;
        boolean isSevenTen = 7 >= 10;

        System.out.println(isTenGreaterThanTwenty);
        System.out.println(isTenLessThanTwenty);
        System.out.println(isTenEqualToTwenty);
        System.out.println(isTenEqualToTen);
        System.out.println(isTenNotEqualToTen);
        System.out.println(isTenSeven);
        System.out.println(isSevenTen);
        System.out.println("------------------------------------------------------------------");

        // &&(AND) ||(OR) !
        int age = 29;//Simulacao de salario minimo para idade
        float salary = 3500F;
        boolean isLegalGreatThanThirty = age >= 30 && salary >= 4612;
        boolean isLegalLessThanThirty = age < 30 && salary >= 3381;
        System.out.println(isLegalGreatThanThirty);
        System.out.println(isLegalLessThanThirty);

        double contaCorrente = 200;
        double contaPoupanca = 20000;
        float playStantion5 = 5000;
        boolean isCanBuyPlaystation5 = contaCorrente >= playStantion5 || contaPoupanca >= playStantion5;
        System.out.println(isCanBuyPlaystation5);

    }
}
