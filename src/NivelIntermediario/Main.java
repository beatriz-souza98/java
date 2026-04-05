package NivelIntermediario;

public class Main {
    public static void main(String[] args) {

        //Obj uzumaki

        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.idade = 15;
        naruto.aldeia = "Aldeia da folha";
        naruto.habilidadeEspecial();
        naruto.estrategiaDeBatalha();
        naruto.ModoSabio();

        //Obj uchiha

        Uchiha sasuke = new Uchiha();
        System.out.println("-----------------------------------------------");
        sasuke.nome = "Sasuke Uchiha";
        sasuke.idade = 17;
        sasuke.aldeia = "Aldeia da folha";
        sasuke.habilidadeEspecial();
        sasuke.estrategiaDeBatalha();
        sasuke.SharinganAtivado();

        //Obj uchiha 2

        Uchiha itachi = new Uchiha("Itachi Uchiha", 35, "Aldeia da folha");
        System.out.println("-----------------------------------------------");
        itachi.habilidadeEspecial();
        itachi.estrategiaDeBatalha();
        itachi.SharinganAtivado();

        //Obj hatake

        Hatake kakashi = new Hatake();
        kakashi.nome = "Kakashi Hatake";
        kakashi.idade = 48;
        kakashi.aldeia = "Aldeia da folha";
        kakashi.boasVindas();
    }
}
