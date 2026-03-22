package NivelIntermediario;

public abstract class Ninja implements EstrategiaDeBatalha{

    String nome;
    int idade;
    String aldeia;


    public Ninja(){
    }

    public Ninja(String nome, int idade, String aldeia) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
    }

    public void habilidadeEspecial(){
        System.out.println("Meu nome é " + nome + " e esse é meu atque especial");
    }

    @Override
    public void estrategiaDeBatalha(){
        System.out.println("Essa é minha estrategia de combate");
    }

    }
