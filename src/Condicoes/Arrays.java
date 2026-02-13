package Condicoes;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        //Arrays e memória
        /*String[] ninja = new String[3];
        ninja[] = "Naruto";
        ninja[] = "Sasuke";
        ninja[] = "Sakura";

        System.out.println(ninja[1]);*/

        //Testando Arrays com Scanner

        Scanner caixaDeTexto = new Scanner(System.in);

        String[] nomeUsuario = new String[3];

        System.out.println("Digite o primeiro nome do Ninja:");
        nomeUsuario[0] = caixaDeTexto.nextLine();

        System.out.println("Digite o segundo nome do Ninja:");
        nomeUsuario[1] = caixaDeTexto.nextLine();

        System.out.println("Digite o terceiro nome do Ninja:");
        nomeUsuario[2] = caixaDeTexto.nextLine();

        System.out.println("Nome do último ninja" + nomeUsuario[2]);

        caixaDeTexto.close();

    }
}
