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

        if (dano > 0){
            personagem.setPontosVida(personagem.getPontosVida() - dano);
            System.out.println("dano causado: " + dano + "| vida total do dragao: " + personagem.getPontosVida());
        } else {
            System.out.println("Uau! LaxyProg neutralizou o ataque!");
        }
    }
}
