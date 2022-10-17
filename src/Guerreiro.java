import java.util.Scanner;

public class Guerreiro extends Personagem {

    public Guerreiro(){
        // o super passa os valores pro construtor da classe personagem
        super(30,20,180);
    }

    @Override
    public void atacar(Personagem personagem) {
        int dano;
        System.out.println("atacando");
        dano = getAtaque() - personagem.getDefesa();

        personagem.setPontosVida(personagem.getPontosVida() - dano);
    }
}
