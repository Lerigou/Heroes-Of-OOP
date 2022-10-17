import java.util.ArrayList;

public class Dragao extends Personagem{
    // Dragão - ataque: 30; defesa: 30; ponto de vida: 300
    //private final int ataque = 30;
    //private final int defesa = 30;
    //private int ptsVida = 300;

    private String nome = "LazyProg";

    public Dragao(){
        super(30, 30, 300);
    }

    @Override
    public void atacar(Personagem personagem) {
        int dano;
        System.out.println("dragao atacando");
        dano = getAtaque() - personagem.getDefesa();

        if (dano > 0){
            personagem.setPontosVida(personagem.getPontosVida() - dano);
            System.out.println("dano causado: " + dano + "| vida total do player: " + personagem.getPontosVida());
        } else {
            System.out.println("Uau! Voce neutralizou o ataque! Se livrando de um golpe de " + dano + " Sua vida agora é: " + personagem.getPontosVida());
        }
    }

    public Personagem prepararAtaque(ArrayList<Personagem> personagens){
        int max = personagens.size() - 1;
        int min = 0;
        int range = max - min + 1;

        int posicaoArray = (int)(Math.random() * range);
        System.out.println("O personagem " + personagens.get(posicaoArray).getNome() + " foi escolhido para tomar pau do dragao");
        return personagens.get(posicaoArray);
    }
}
