package Condições;

public class ifElse {
    public static void main(String[] args) {

        String nome = "Naruto";
        int idade = 14;
        boolean hokage = false;
        short numeroDeMissoes = 14;
        String ranking;

        if (numeroDeMissoes >= 10 && idade >= 15) {
            System.out.println(nome + " esta no Ranking Chunnin ");
    } else if (numeroDeMissoes >= 20 && idade >= 15) {
            System.out.println(nome + " esta no Ranking Jounin ");
        } else {
            System.out.println(nome + " esta no Ranking Gennin");
        }
}}
