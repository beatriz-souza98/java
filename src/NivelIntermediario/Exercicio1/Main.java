package NivelIntermediario.Exercicio1;

public class Main {

    public static void main(String[] args) {

        //Criar ninja usando Classe Ninja

        Ninja Naruto = new Ninja();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.idade = 18;
        Naruto.missao = "matar o chefão";
        Naruto.nivelDificuldade = "master";
        Naruto.statusMissao = "finalizado";
        Naruto.mostrarInformacoes();

        //Criar ninja com Sub Classe Uchiha

        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.habilidadeEspecial = "Sharigan";
        Sasuke.mostrarhabilidadeEspecial();
    }

    }
