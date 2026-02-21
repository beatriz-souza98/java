package Condicoes;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        //Calculadora de média

        Scanner caixaDeTexto = new Scanner(System.in);

        double[] notas = new double[10];
        int contadorDeNotas = 0;
        int escolhaDoMenu = 0;

        while (escolhaDoMenu != 3){
            System.out.println("Bem vindo(a) a calculadora de notas!");
            System.out.println("Escolha uma opção:");
            System.out.println("1- Cadastre sua nota");
            System.out.println("2- Resultado da média das notas");
            System.out.println("3- Sair");
            escolhaDoMenu = caixaDeTexto.nextInt();
            caixaDeTexto.nextLine();

            switch (escolhaDoMenu){
                case 1:
                    System.out.println("Digite sua nota:");
                    notas[contadorDeNotas] = caixaDeTexto.nextDouble();
                    caixaDeTexto.nextLine();
                    contadorDeNotas++;
                    break;
                case 2:
                    if (contadorDeNotas > 0){
                        double soma = 0;
                        for (int i = 0; i < contadorDeNotas; i++) {
                            soma += notas[i];
                        }
                        double media = (double) soma / contadorDeNotas;
                        System.out.println("Sua média é: " + media);
                    }
                    else{
                        System.out.println("Nenhuma nota cadastrada");
                    }
                    break;
            }
        }
        caixaDeTexto.close();
    }
}
