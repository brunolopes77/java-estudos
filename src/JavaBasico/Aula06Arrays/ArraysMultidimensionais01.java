package JavaBasico.Aula06Arrays;

public class ArraysMultidimensionais01 {
    public static void main(String[] args) {
        int[][] dias = new int [3][3];
        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;

        dias[1][0] = 31;
        dias[1][1] = 28;
        dias[1][2] = 31;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }
        System.out.println("--------------------------");

        // arrBase[0] = dias [0]
        //num = arrBase[0][0]
        //System.out.println(num);
        for(int[]arrBase : dias){
            for(int num : arrBase){//vai passar em cada casa
                System.out.println(num);
            }
        }
    }
}
