package NivelIntermediario;

public class Main {
    public static void main(String[] args) {

        //Criar o ninja Naruto

        Ninja Naruto = new Ninja();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.idade = 18;
        Naruto.aldeia = "Aldeia da Folha";

        //Aplicando metodos aos meus objetos

        Naruto.SharinganAtivado();

        // Criar ninja Sasuke

        Ninja Sasuke = new Ninja();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.idade = 17;
        Sasuke.aldeia = "Aldeia da Folha";

        // Fazer metodo String que retorna uma String

        String chamandoMetodo = Sasuke.boasVindasMeuNomeE();
        System.out.println(chamandoMetodo);

        //Fazer metodo int que mostra um int
        int idadeQueFalta = Sasuke.anosParaSerHohake(25);
        System.out.println("Ainda falta " + idadeQueFalta + " anos para você se tornar um Hohake");

    }
}
