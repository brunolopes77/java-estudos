package JavaBasicoExercicios;

public class Ex03_DiaUtil {
    public static void main(String[] args) {
        //Dados os valores de 1 a 7, imprima se é dia ultil ou final de semana
        //Considerando 1 como domingo
        byte day = 7;
        if(day >= 2 && day <= 6){
            System.out.println("Dia util");
        }else if(day == 1 || day == 7){
            System.out.println("Final de semana");
        }else{
            System.out.println("Resposta invalida");
        }
    }
}
