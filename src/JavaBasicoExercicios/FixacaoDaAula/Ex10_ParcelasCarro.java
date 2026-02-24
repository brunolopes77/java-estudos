package JavaBasicoExercicios.FixacaoDaAula;

public class Ex10_ParcelasCarro {
    //Quantas parcelas posso ter para um certo valor de carro
    //condicao valueInstallment >= 1000
    public static void main(String[] args) {
        double valueCar = 23345;
        for (int installment = 1; installment <= valueCar; installment++) {
            double valueInstallment = valueCar/installment;
            if (valueInstallment < 1000) {
                break;
            }
            System.out.println("Parcela "+installment+" R$: "+valueInstallment);
        }
    }
}