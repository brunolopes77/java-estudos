package javacore.Fmodificadorestatico.test;

import javacore.Fmodificadorestatico.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("Porshe",280);
        Carro c2 = new Carro("Ferrari",340);
        Carro c3 = new Carro("Lamborghini",335);

        Carro.velocidadeLimite = 120;

        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
