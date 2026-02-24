package JavaBasicoExercicios.FixacaoDaAula;

public class Ex06_AproveitamentoDeUmAluno {
    public static void main(String[] args) {
     // A proveitamendo de um aluno:A,B,C,D,E,F
        double grade1 =7;
        double grade2 =4;
        double average;

        average = (grade1+grade2)/2;
        if(average > 10 || average < 0) {
            System.out.println("Nota colocada errada");
        } else if (average >= 9) {
            System.out.println("A media foi de "+average+" e o aproveitamento foi de: A");
        }else if (average >= 8) {
            System.out.println("A media foi de "+average+" e o aproveitamento foi de: B");
        }else if (average >= 7) {
            System.out.println("A media foi de "+average+" e o aproveitamento foi de: C");
        }else if (average >= 6) {
            System.out.println("A media foi de "+average+" e o aproveitamento foi de: D");
        }else if (average >= 5) {
            System.out.println("A media foi de "+average+" e o aproveitamento foi de: E");
        }else {
            System.out.println("A media foi de " + average + " e o aproveitamento foi de: F");
        }
    }
}
