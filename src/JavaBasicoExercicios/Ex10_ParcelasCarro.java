package JavaBasicoExercicios;

public class Ex10_ParcelasCarro {
    //Quantas parcelas posso ter para um certo valor de carro
    //condicao valueInstallment >= 1000
    public static void main(String[] args) {
        double valueCar = 40000;
        int installment = 0;
        for (int i = 0; i < 1000; i++) {
            if (valueCar/i >= 1000) {
                installment = i;
            }

        }
        System.out.println(installment);
    }
}