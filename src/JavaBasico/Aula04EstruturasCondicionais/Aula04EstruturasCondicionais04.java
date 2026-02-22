package JavaBasico.Aula04EstruturasCondicionais;

public class Aula04EstruturasCondicionais04 {
    public static void main(String[] args) {
        // imprima o dia da semana, considere 1 como domingo
        //switch : char,int,byte,short,enum,String
        byte day = 3;
        switch (day) {
            case 1:
                System.out.println("dom");
                break;
            case 2:
                System.out.println("seg");
                break;
            case 3:
                System.out.println("ter");
                break;
            case 4:
                System.out.println("quar");
                break;
            case 5:
                System.out.println("quin");
            case 6:
                System.out.println("sex");
                break;
            case 7:
                System.out.println("sab");
                break;
            default:
                System.out.println("Opçoes invalidas");
                break;
        }
        //indentificar o sexo feminimo e masculino
        char gender = 'M';
        switch (gender){
            case 'M':
                System.out.println("Masculino");
                break;
            case 'F':
                System.out.println("Femenino");
                break;
            default:
                System.out.println("Opcao invalida");
                break;
        }
    }
}
