package Condicoes;

import java.util.Scanner;

public class Treino2 {
    public static void main(String[] args) {
        // Peça ao usuario o nome do ninja e faça uma array sem colocar manualmente as posições da memoria

        Scanner caixaDeTexto = new Scanner(System.in);

        String[] nomeDoUsuario = new String[3];
        for (int i = 0; i < nomeDoUsuario.length; i++) {
            System.out.println("Digite o nome do ninja");
            nomeDoUsuario[i] = caixaDeTexto.nextLine();

        System.out.println(nomeDoUsuario[1]);

        caixaDeTexto.close();
    }
}
}
