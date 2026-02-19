package Condicoes;

public class Arrays2 {
    public static void main(String[] args) {

        String[] ninja = new String[4];
        ninja[0] = "Naruto";
        ninja[1] = "Sasuke";
        ninja[2] = "Sakura";
        ninja[3] = "Hinata";



// Redeclarando Arrays
        ninja = new String[4];
        ninja[0] = "Adriel";
        ninja[1] = "Bia";
        ninja[2] = "Vera";
        ninja[3] = "Cicera";

        for (int i = 0; i < 7; i++) {
            System.out.println(ninja[i]);
        }
    }
}
