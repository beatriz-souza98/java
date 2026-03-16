package NivelIntermediario;

public class Boruto extends Uzumaki implements HyugaUzumaki {

    public void AtivarOKarma(){
        System.out.println("O Karma foi ativado");
    }

    public void AtivarJougan(){
        System.out.println("O Jougan foi ativado");
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e eu sou uma Hyunga Uzumaki");
    }
}
