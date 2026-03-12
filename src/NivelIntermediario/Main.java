package NivelIntermediario;

public class Main {
    public static void main(String[] args) {

        //Criar o ninja Naruto

        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.idade = 18;
        Naruto.aldeia = "Aldeia da Folha";
        Naruto.ModoSabio();

        // Criar o ninja Sasuke

        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.idade = 17;
        Sasuke.aldeia = "Aldeia da Folha";
        Sasuke.SharinganAtivado();

        // Criar a ninja Sakura

        Haruno Sakura = new Haruno();
        Sakura.nome = "Sakura Haruno";
        Sakura.idade = 15;
        Sakura.aldeia = "Aldeia da Folha";
        Sakura.ModoCura();

    }
}
