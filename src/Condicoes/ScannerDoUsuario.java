package Condicoes;

import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {
        /* O usuario vai criar um ninja e vamos validar os dados*/

        Scanner caixaDeTexto = new Scanner(System.in);

        /*Recebendo nome do Ninja*/
        System.out.println("Escreva aqui o nome do Ninja:");
        String nomeDoNinja = caixaDeTexto.nextLine();
        System.out.println("O nome do Ninja é: " + nomeDoNinja);

        /*Recebendo idade do Ninja*/
        System.out.println("Escreva aqui a idade do Ninja:");
        int idade = caixaDeTexto.nextInt();
        System.out.println("A idade do Ninja é: " + idade);
        caixaDeTexto.close();

        /* Tratamento de dados*/
        if (idade >= 20){
            System.out.println("Esse Ninja já é maior de idade");
        }
        else {
            System.out.println("Esse Ninja é novo demais");
        }
    }
}
