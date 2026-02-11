package Condicoes;

import java.util.Scanner;

public class SwitchCases {
    public static void main(String[] args) {
        /* Pedir para o usuario escolher entre os ninjas */

        Scanner caixaDeTexto = new Scanner(System.in);

        System.out.println("Escolha um personagem:");
        System.out.println("1 - Naruto");
        System.out.println("2 - Sasuke");
        System.out.println("3 - Sakura");

        int escolhaDoUsuario = caixaDeTexto.nextInt();

        switch (escolhaDoUsuario) {
            case 1:
            System.out.println("Voce escolheu o Naruto");
            break;

            case 2:
                System.out.println("Voce escolheu o Sasuke");
                break;

            case 3:
                System.out.println("Voce escolheu o Sakura");
                break;
            default:
                System.out.println("Não respondeu uma resposta válida, tente denovo");
        }
        caixaDeTexto.close();
    }
}
