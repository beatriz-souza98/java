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

        // Criar a ninja Hinata

        Hyuga Hinata = new Hyuga();
        Hinata.nome = "Hinata Hyunga";
        Hinata.idade = 17;
        Hinata.aldeia = "Aldeia da Folha";
        Hinata.ByakuganAtivado();

        // Criar ninja Boruto

        Boruto Boruto = new Boruto();
        Boruto.nome = "Boruto Hyunga Uzumaki";
        Boruto.idade = 9;
        Boruto.aldeia = "Aldeia da Folha";
        Boruto.AtivarOKarma();
        Boruto.AtivarJougan();
        Boruto.ModoSabio();

    }
}
