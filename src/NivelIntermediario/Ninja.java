package NivelIntermediario;

public abstract class Ninja implements EstrategiaDeBatalha{

    String nome;
    String aldeia;
    int idade;

    public void habilidadeEspecial(){
        System.out.println("Meu nome é " + nome + " e esse é meu atque especial");
    }

    @Override
    public void estrategiaDeBatalha(){
        System.out.println("Essa é minha estrategia de combate");
    }

    }
