package NivelIntermediario;

public class Ninja {

    String nome;
    String aldeia;
    int idade;

    //Criar um metodo público personalizado
    public void SharinganAtivado(){
        System.out.println("O Sharingan ativou!");
    }

    public String boasVindasMeuNomeE(){
        return "Oi, eu sou um ninja!";
    }

    public int anosParaSerHohake(int idadeMinina){
        return idadeMinina - idade;
    }

    }
