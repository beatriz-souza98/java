package TiposDeDados;

public class Exercicios {
    public static void main(String[] args) {
/* Crie um programa que represente três ninjas da Vila da Folha
de Naruto e suas respectativas missões */
        String nomeDoNinja1 = "Naruto";
        int idade1 = 14;
        String missao1 = "Xorana";
        String nivel1 = "A";
        String concluido1 = "Em andamento";

        String nomeDoNinja2 = "Sakura";
        int idade2 = 22;
        String missao2 = "Xorana";
        String nivel2 = "C";
        String concluido2 = "Em andamento";

        String nomeDoNinja3 = "Sasuke";
        int idade3 = 29;
        String missao3 = "Xorana";
        String nivel3 = "D";
        String concluido3 = "Em andamento";



        // Verificar nivel da missão e dade do nissa
        if (idade1 < 15) {
            if (nivel1 == "C" || nivel1 == "D") {
                concluido1 = "Concluida";
            } else {
                concluido1 = "Não concluida";
            }}
            if (idade1 > 15){
                concluido1 = "Concluida";
            }

       //-------------------------------------------

        if (idade2 < 15) {
            if (nivel2 == "C" || nivel2 == "D") {
                concluido2 = "Concluida";
            } else {
                concluido2 = "Não concluida";
            }}
        if (idade2 > 15){
            concluido2 = "Concluida";
        }
      //---------------------------------------------

        if (idade3 < 15) {
            if (nivel3 == "C" || nivel3 == "D") {
                concluido3 = "Concluida";
            } else {
                concluido3 = "Não concluida";
            }}
        if (idade3 > 15){
            concluido3 = "Concluida";
        }

            System.out.println("Nome do Ninja: " + nomeDoNinja1);
            System.out.println("Idade: " + idade1);
            System.out.println("Missão: " + missao1);
            System.out.println("Nivel: " + nivel1);
            System.out.println("Concluido? " + concluido1);
            System.out.println("-----------------------------------------------------");

            System.out.println("Nome do Ninja: " + nomeDoNinja2);
            System.out.println("Idade: " + idade2);
            System.out.println("Missão: " + missao2);
            System.out.println("Nivel: " + nivel2);
            System.out.println("Concluido? " + concluido2);
            System.out.println("-----------------------------------------------------");

            System.out.println("Nome do Ninja: " + nomeDoNinja3);
            System.out.println("Idade: " + idade3);
            System.out.println("Missão: " + missao3);
            System.out.println("Nivel: " + nivel3);
            System.out.println("Concluido? " + concluido3);
            System.out.println("-----------------------------------------------------");
        }
    }

