package Condicoes;

import java.util.Scanner;

public class Treino {
    public static void main(String[] args) {
        /* Peça a idade do usuario e informe se ele é maior de idade */
        Scanner caixaDeTexto = new Scanner(System.in);

        System.out.println("Informe sua idade:");
        int idade = caixaDeTexto.nextInt();

        if (idade >= 18){
            System.out.println("Você é maior de idade");
        }
        else{
            System.out.println("Você é menor de idade");
        }

        /* Peça ao usuario que escolha um lanche */

        System.out.println("Escolha um lanche:");
        System.out.println("1 - Coxinha");
        System.out.println("2 - Enroladinho de Vina");
        System.out.println("3 - Pizza");

        int escolha = caixaDeTexto.nextInt();

        switch (escolha){
            case 1:
                System.out.println("Você escolheu a Coxinha");
                break;

            case 2:
                System.out.println("Você escolheu o Enroladinho de Vina");
                break;

            case 3:
                System.out.println("Você escolheu a Pizza");
                break;

            default:
                System.out.println("Você digitou uma opção inválida, tente novamente");
        }

        caixaDeTexto.close();
    }
}
