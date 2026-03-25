package javacore.Dconstrutores.test;


import javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Akudama Drive", "TV",12,"Ação","Television");
        Anime anime2 = new Anime("bruno","tv",134,"terror","dorama");
        anime.imprime();
        anime2.imprime();
    }
}


