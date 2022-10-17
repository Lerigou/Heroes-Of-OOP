import java.util.Scanner;

public class Arqueiro extends Personagem{
    public Arqueiro(){
        super(20, 30, 160);
    }

    @Override
    public void atacar(Personagem personagem) {
        int dano;
        System.out.println("atacando");
        dano = getAtaque() - personagem.getDefesa();

        personagem.setPontosVida(personagem.getPontosVida() - dano);
    }
}
