package JavaBasico.Aula04EstruturasCondicionais;

public class Aula04EstruturasCondicionais03 {
    public static void main(String[] args) {
        //Operador ternário
        //Se salário > 5000,doação de 500 para DevDojo
        double salary = 6000;
        String donationMessage = "Doar 500 para DevDojo";
        String noDonationMessage = "Nao doar para DevDojo";
        String result = salary > 500 ? donationMessage : noDonationMessage;
        System.out.println(result);
    }
}
