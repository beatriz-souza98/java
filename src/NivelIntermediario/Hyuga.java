package NivelIntermediario;

public class Hyuga extends Ninja{

    public void ByakuganAtivado(){
        System.out.println("Byakugan ativado!");
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e eu sou uma Hyuga");
    }
}
