import java.util.ArrayList;
import java.util.Random;

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
    public void atacar(Dragao dragao) {}

    @Override
    public void defender(Personagem personagens, Dragao dragao) {
        System.out.println("defendendo");
        setDefesa(getDefesa() + (getDefesa() * ((10/100) * getDefesa())));
        setPontosVida(getPontosVida() - personagens.getDano());

        System.out.println("A vida de LazyProg totaliza agora em " + getPontosVida() + " de vida!\n");
    }
}
