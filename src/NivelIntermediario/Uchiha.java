package NivelIntermediario;

public class Uchiha extends Ninja {
public void SharinganAtivado(){
    System.out.println("Sharingan ativado!");
}

    public Uchiha() {
    super();
    }

    public Uchiha(String nome, int idade, String aldeia) {
        super(nome, idade, aldeia);
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e eu sou um Uchiha");
    }

    public void estrategiaDeBatalha(){
        System.out.println("Essa é minha estrategia de batalha");
    }
}
