package NivelIntermediario;

public class Uzumaki extends Ninja {

    public void ModoSabio(){
        System.out.println("Ativado modo Uzumaki");
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e eu sou um Uzumaki");
    }
}
