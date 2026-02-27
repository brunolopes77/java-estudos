package POO.Introducaoclasses.test;

import POO.Introducaoclasses.dominio.Estudante;
//estudante=variavel grandona/objeto
public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();//Variaval de referencia do tipo Estudante e objeto do tipo Estudante
        estudante.nome = "Bruno";
        estudante.idade = 19;
        estudante.sexo = 'M';

        System.out.println();
    }
}
