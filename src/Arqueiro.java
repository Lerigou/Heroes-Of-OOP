import java.util.Scanner;

public class Arqueiro extends Personagem{
    public Arqueiro(){
        super(20, 30, 160);
    }

    @Override
    public void atacar(Personagem personagem) {
        int dano;

        System.out.println("\n\033[4;31mO arqueiro se prepara para acertar o dragao.\033[0m\033[1;97m\n\n- - - - - -");
        
        dano = getAtaque() - personagem.getDefesa();

        personagem.setPontosVida(personagem.getPontosVida() - dano);
    }
}
