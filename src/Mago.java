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

        if (dano > 0){
            personagem.setPontosVida(personagem.getPontosVida() - dano);
            System.out.println("dano causado: " + dano + "| vida total do dragao: " + personagem.getPontosVida());
        } else {
            System.out.println("Uau! LaxyProg neutralizou o ataque!");
        }
    }
}
