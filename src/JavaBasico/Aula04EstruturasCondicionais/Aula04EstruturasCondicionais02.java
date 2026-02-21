package JavaBasico.Aula04EstruturasCondicionais;

public class Aula04EstruturasCondicionais02 {
    public static void main(String[] args) {
        // age < 15 categoria infantil
        // age >= 15 && age < 18 categoria juvenil
        //age >= 18 categoria adulto
        int age = 19;
        String category;
        if(age < 15){
            category = "Categoria infantil";
        }else if(age >= 15 && age < 18){
            category = "Categoria juvenil";
        }else{
            category = "Categoria adulto";
        }
        System.out.println(category);
    }
}
