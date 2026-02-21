package JavaBasico.EstruturaCondicionais;

public class Aula04EstruturaCondicionais {
    public static void main(String[] args) {
        int age = 15;
        boolean isAllowedToBuyAlcohol = age >= 18;
        //!
        if (isAllowedToBuyAlcohol){
            System.out.println("autorizado a comprar bebida alcoólica");
        }
        if (!isAllowedToBuyAlcohol){
            System.out.println("Não autorizado a comprar bebida alcoólica");
        }
    }
}
