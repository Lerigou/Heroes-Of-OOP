import java.util.Scanner;

public class Arqueiro extends Personagem{
    public Arqueiro(){
        super(20, 30, 160);
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
