import java.util.Scanner;

public class Mago extends Personagem{

    public Mago(){
        super(20, 10, 200);
    }

    @Override
    public void atacar(Personagem personagem) {
        int dano;
        System.out.println("atacando");
        dano = getAtaque() - personagem.getDefesa();

        personagem.setPontosVida(personagem.getPontosVida() - dano);
    }
}
