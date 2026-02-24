package JavaBasicoExercicios.FixacaoDaAula;

public class Ex07_PartidaGols {
    public static void main(String[] args) {
        int time1 = 2;
        int time2 = 7;
        int difference;

        if (time1 > time2) {
            difference = time1 - time2;
        } else {
            difference = time2 - time1;
        }

        System.out.println("A diferenca de gols foi de "+difference);

        if (difference >= 4) {
            System.out.println("Goleada");
        } else if (difference <= 3 && difference >= 1) {
            System.out.println("Partida normal");
        } else {
            System.out.println("Empate");
        }
    }
}
