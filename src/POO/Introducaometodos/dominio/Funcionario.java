package POO.Introducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public float [] salarios;


    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salarios == null){
            return;
        }
        for (float salario: this.salarios){
                System.out.println(salario);
        }
        mediaDosSalarios();
    }
    public void mediaDosSalarios(){
        if (salarios == null){
            return;
        }
        float media =0;
        for (float salario: this.salarios){
        media += salario;
        }
        media /= salarios.length;
        System.out.println(media);
    }
}
