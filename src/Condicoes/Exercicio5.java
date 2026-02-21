package Condicoes;

public class Exercicio5 {
    public static void main(String[] args) {

        /* Treino for

        int[] numeros = new int[5];
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;

        for (int i = 0; i < 5; i++) {
            System.out.println(numeros[i]);
        }*/

        /* For com média
        int[] notas = new int[4];
        notas[0] = 4;
        notas[1] = 8;
        notas[2] = 12;
        notas[3] = 16;

        int soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        int media = soma / notas.length;
        System.out.println("A média é: " + media);
        }*/

        //For com double
        double[] numeros = {5.5, 7.2, 9.3};
        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros.length;
        }
        double media = (double) soma / numeros.length;
        System.out.println("A média é: " + media);
    }
}
