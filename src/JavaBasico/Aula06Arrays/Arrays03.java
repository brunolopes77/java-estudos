package JavaBasico.Aula06Arrays;

public class Arrays03 {
    public static void main(String[] args) {
        int [] numeros1 = {1,2,3,4,5,};
        int [] numeros2 = new int[]{5,4,3,2,1};
        for (int i = 0; i < numeros1.length; i++) {
            System.out.println(numeros2[i]);
        }
        // num = numeros2[0];
        //system.out.println(num);
        //num = numeros2[1];
        //system.out.println(num);
        for (int num : numeros2){
            System.out.println(num);
        }
    }
}
