package NivelIntermediario.Exercicio2;

public class Main {
    public static void main(String[] args) {

        // Criar Ninja Basico
        NinjaBasico Sasuke = new NinjaBasico("Sasuke", 16, "Sharingan");
        Sasuke.mostrarInformacoes();
        Sasuke.executarHabilidade();

        //Criar divisoria entre Ninjas

        System.out.println("--------------------------------------------------------");

        // Criar Ninja Avancado

        NinjaAvancado Naruto = new NinjaAvancado("Naruto", 24, "Modo Sábio", "Chakra absurdo");
        Naruto.mostrarInformacoes();
        Naruto.executarHabilidade();
    }
}
