package JavaBasico.Aula04EstruturasCondicionais;

public class Aula04EstruturaCondicionais01 {
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

        double salary = 3000;
        if (salary >= 4000){
            System.out.println("Comprar celular");
        }else{
            System.out.println("Nao comprar carro");
        }
    }
}
