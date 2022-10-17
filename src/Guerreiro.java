import java.util.Scanner;
import java.util.Random;

public class Guerreiro extends Personagem {

    public Guerreiro(){
        // o super passa os valores pro construtor da classe personagem
        super(30,20,180);
    }

    @Override
    public void atacar(Personagem personagem) {
        int dano;
        
        System.out.println("\n\033[4;31mO guerreiro corre na direcao do dragao para ataca-lo.\033[0m\033[1;97m\n\n- - - - - - - - - - - - - - - - - -");
        
        dano = getAtaque() - personagem.getDefesa();

        if (dano > 0){
            personagem.setPontosVida(personagem.getPontosVida() - dano);
            System.out.println("Dano causado: " + dano + "| Vida total do dragao: " + personagem.getPontosVida()+"\n- - - - - - - - - - - - - - - - - -");
        } else {
            System.out.println("Uau! LaxyProg neutralizou o ataque!");
        }
    }
}
