package Condicoes;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner caixaDeTexto = new Scanner(System.in);
        System.out.println("Seja bem-vindo(a) ao Mundo Hokake");
        System.out.println("O que você deseja fazer agora?");
        System.out.println("1- Cadastra ninja");
        System.out.println("2- Listar ninjas");
        System.out.println("3- Sair");
        int escolha = caixaDeTexto.nextInt();

        switch (escolha){
            case 1:
                System.out.println("Digite o nome do ninja:");
                String nomeDoNinja = caixaDeTexto.nextLine();
                break;
        }

        caixaDeTexto.close();


    }
}
