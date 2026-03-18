package NivelIntermediario.Exercicio2;

public class NinjaAvancado extends NinjaBasico implements Ninja{

String especialidade;


    public NinjaAvancado(String nome, int idade, String habilidade, String especialidade) {
        super(nome, idade, habilidade);
        this.especialidade = especialidade;
    }

        @Override
        public void mostrarInformacoes() {
            System.out.println("Nome do ninja: " + nome +
                    "\nIdade: " + idade +
                    "\nPrincipal Habilidade: " + habilidade +
                    "\nEspecialidade: " + especialidade);
        }

        @Override
        public void executarHabilidade() {
            System.out.println(habilidade + " ativado(a)!");
    }
}
