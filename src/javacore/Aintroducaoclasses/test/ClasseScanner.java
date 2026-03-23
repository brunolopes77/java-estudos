package javacore.Aintroducaoclasses.test;

import java.util.Scanner;

public class ClasseScanner {
    public static void main(String[] args) {
        Scanner informaçaoUsuario = new Scanner(System.in);
        String nome;
        int idade;
        System.out.println("Qual é seu nome?");
        nome =  informaçaoUsuario.nextLine();
        System.out.println("Bem vindo "+ nome);

        System.out.println("Quantos anos voce tem ? ");
        idade = informaçaoUsuario.nextInt();
        System.out.println(idade + "anos");

        informaçaoUsuario.close();
    }
}
