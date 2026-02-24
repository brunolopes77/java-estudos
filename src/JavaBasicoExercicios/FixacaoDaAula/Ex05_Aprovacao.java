package JavaBasicoExercicios.FixacaoDaAula;

public class Ex05_Aprovacao {
    public static void main(String[] args) {
        //nota1 e nota 2, se a media > 7 aluno aprovado,se nao reprovado
        double grade1 = 34;
        double grade2 = 23;
        double average;
        String result1 = "aprovado";
        String result2 = " reprovado";

        average = (grade1 + grade2)/2;
        if(average < 7){
            System.out.println("A media foi de "+average+", e o aluno está "+result2);
        }else{
            System.out.println("A media foi de "+average+", e o aluno está "+result1);
        }
    }
}
