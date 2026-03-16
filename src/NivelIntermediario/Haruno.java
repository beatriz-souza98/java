package NivelIntermediario;

public class Haruno extends Ninja {
    public void ModoCura(){
        System.out.println("Modo cura ativado!");
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e eu sou uma Haruno");
    }
}
