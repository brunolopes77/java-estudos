package JavaBasicoExercicios;

public class Ex10_ParcelasCarro {
    //Quantas parcelas posso ter para o valor de um carro
    //condicao valueInstallment >= 1000
    public static void main(String[] args) {
        double valueCar = 30000;
        double valueInstallment;
        for (int i = 0; i < 1000; i++) {
            valueInstallment = valueCar/i;
            if(valueCar/i >= 1000){
                break;
            }
            System.out.println(i);
        }
    }
}
