package Condicoes;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        // Programa de cadastro de ninjas

        Scanner caixaDeTexto = new Scanner(System.in);

        String[] ninjas = new String[10];
        int contadorDeNinja = 0;
        int escolha = 0;

        while (escolha != 3) {
            System.out.println("Seja bem-vindo(a) ao Mundo Hokage");
            System.out.println("O que você deseja fazer agora?");
            System.out.println("1- Cadastra ninja");
            System.out.println("2- Listar ninjas");
            System.out.println("3- Sair");
            escolha = caixaDeTexto.nextInt();
            caixaDeTexto.nextLine();

            switch (escolha){
                case 1:
                    System.out.println("Digite o nome do ninja");
                    ninjas[contadorDeNinja] = caixaDeTexto.nextLine();
                    contadorDeNinja++;
                    break;
                case 2:
                    for (int i = 0; i < contadorDeNinja; i++) {
                        System.out.println(ninjas[i]);
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
