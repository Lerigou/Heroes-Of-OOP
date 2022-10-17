import java.util.Scanner;

public class Mago extends Personagem{

    public Mago(){
        super(20, 10, 200);
    }

    @Override
    public void atacar(Personagem personagem) {
        int dano;

        System.out.println("\n\033[4;31mO mago começa a conjurar o seu feitiço para atacar o dragao.\033[0m\033[1;97m\n\n- - - - - -");
        
        dano = getAtaque() - personagem.getDefesa();

        if (dano > 0){
            personagem.setPontosVida(personagem.getPontosVida() - dano);
            System.out.println("dano causado: " + dano + "| vida total do dragao: " + personagem.getPontosVida());
        } else {
            System.out.println("Uau! LaxyProg neutralizou o ataque!");
        }
    }
}
