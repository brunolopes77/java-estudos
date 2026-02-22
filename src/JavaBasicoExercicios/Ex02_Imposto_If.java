package JavaBasicoExercicios;

public class Ex02_Imposto_If {
    public static void main(String[] args) {
        //se salary <= 34712 paga 9.7% de imposto
        // se salary >= 34713 && salary <= 68507 paga 37.55% de imposto
        // se salary >= 68508 paga  49.5%
        double annualSalary = 40000;
        double taxRate;
        if(salary <= 34712){
            taxRate = salary * (9.7/100);
        }else if(salary >= 34713 && salary <= 68507){
            taxRate = salary * (37.55/100);
        }else{
            taxRate = salary * (49.5/100);
        }
        System.out.println("O total de imposto a ser pago é: "+taxRate);
    }
}
