package Condicoes;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        // Programa de cadastro de integrantes

        Scanner caixaDeTexto = new Scanner(System.in);
        String[] integrantes = new String[5];

        int contadorDeIntegrantes = 0;
        int escolhasDoUsuario = 0;

        while (escolhasDoUsuario != 3){
            System.out.println("Seja Bem Vindo(a) a Familia Silva");
            System.out.println("O que deseja fazer agora?");
            System.out.println("1- Cadastrar integrante");
            System.out.println("2- Listar integrantes cadastrados");
            System.out.println("3- Sair");
            escolhasDoUsuario = caixaDeTexto.nextInt();
            caixaDeTexto.nextLine();

switch (escolhasDoUsuario){
    case 1:
        System.out.println("Digite o nome do novo integrante:");
        integrantes[contadorDeIntegrantes] = caixaDeTexto.nextLine();
        contadorDeIntegrantes++;
        break;
    case 2:
        for (int i = 0; i < contadorDeIntegrantes; i++) {
            System.out.println(integrantes[contadorDeIntegrantes]);
        }
        break;
    case 3:
        System.out.println("Saindo do sistema...");
        break;
}
        }
        caixaDeTexto.close();
    }
}
