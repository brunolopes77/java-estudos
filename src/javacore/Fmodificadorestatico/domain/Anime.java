package javacore.Fmodificadorestatico.domain;

public class Anime {
    private String nome;
    private static int[] episodios;
    // 0 - Bloco de inicializacao estatico é executado pela JVM porque la identifica a classe e a executa.
    // 1 - Alocado espaço na memoria para meu objeto
    // 2 - Meus atributos sao inicializados com valor default ou como o valor passado
    // 3 - Bloco de inicialização
    //4 - Construtores

    static {
        System.out.println("Dentro do bloco de inicialização estatico");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }


    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime(){
        for (int episodios : Anime.episodios){
            System.out.print(episodios+" ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
