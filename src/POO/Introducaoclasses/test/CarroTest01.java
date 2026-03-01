package POO.Introducaoclasses.test;

import POO.Introducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();//variaveis de referencia para cada objeto
        Carro carro2 = new Carro();

        carro1.nome = "Civic";
        carro1.modelo = "Turbo";
        carro1.ano = 2021;


        carro2.nome = "Corrola";
        carro2.modelo = "Turbo";
        carro2.ano = 2020;


        System.out.println("Nome: "+carro1.nome + " Modelo: "+ carro1.modelo+ " Ano: "+carro1.ano);
        System.out.println("Nome: "+carro2.nome + " Modelo: "+ carro2.modelo+ " Ano: "+carro2.ano);
    }
}
