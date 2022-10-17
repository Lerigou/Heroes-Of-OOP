import java.util.Scanner;

public class Guerreiro extends Personagem {

    public Guerreiro(){
        // o super passa os valores pro construtor da classe personagem
        super(30,20,180);
    }

    @Override
    public void atacar(Dragao dragao) {
        System.out.println("atacando");
        setDano(getAtaque() - getDefesa());

        dragao.setPontosVida(dragao.getPontosVida() - (int)getDano());
    }

    @Override
    public void defender() {
    }
}
