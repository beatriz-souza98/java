package Condicoes;

public class Ternarios {
    public static void main(String[] args) {
        short numerosDeMissoes = 11;
        String nivel = (numerosDeMissoes >= 10) ? "Esse ninja ésta com mais de 10 missões" : "Esse ninja tem abaixo de 10 missões";
        System.out.println(nivel);
    }
}
