package NivelIntermediario.Exercicio2;

public class NinjaBasico implements Ninja {

    String nome;
    int idade;
    String habilidade;

    public NinjaBasico(String nome, int idade, String habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }

    public void mostrarInformacoes() {
        System.out.println("Nome do ninja: " + nome +
                "\nIdade: " + idade +
                "\nPrincipal Habilidade: " + habilidade);
    }

    public void executarHabilidade() {
        System.out.println(habilidade + " ativado(a)!");
    }
}
