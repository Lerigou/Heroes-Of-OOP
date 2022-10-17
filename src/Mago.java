import java.util.Scanner;

public class Mago extends Personagem{

    public Mago(){
        super(20, 10, 200);
    }

    @Override
    public void atacar(Dragao dragao) {
        System.out.println("atacando");
        setDano(getAtaque() - getDefesa());

        dragao.setPontosVida(dragao.getPontosVida() - (int)getDano());
    }

    @Override
    public void defender(Dragao dragao) {
        System.out.println("defendendo");
        setDefesa(getDefesa() + (getDefesa() * ((10/100) * getDefesa())));
    }
}
