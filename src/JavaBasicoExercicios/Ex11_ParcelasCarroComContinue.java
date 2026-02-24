package JavaBasicoExercicios;

public class Ex11_ParcelasCarroComContinue {
    //Quantas parcelas posso ter para um certo valor de carro
    //condicao valueInstallment >= 1000
    public static void main(String[] args) {
        double valueCar = 30000;
        for (int installment = (int) valueCar; installment >= 1 ; installment--) {
            double valueInstallment = valueCar/installment;
            if (valueInstallment < 1000){
                continue;
            }
            System.out.println("Parcela "+installment+" R$: "+valueInstallment);
        }
    }
}




