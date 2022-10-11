public class Guerreiro extends Personagem {
    // Guerreiro - ataque: 30; defesa: 20; ponto de vida: 180
    // Armas - Espada ataque: +10; defesa: +15
    // Armas - Machado: ataque: +17; defesa: +8
    private int ataque = 30;
    private int defesa = 20;
    private int ptsVida = 180;

    private final int espadaAtaque = 10;
    private final int espadaDefesa = 15;
    private final int machadoAtaque = 17;
    private final int machadoDefesa = 8;

    @Override
    public void atacar(int armaEscolhida) {
        if (armaEscolhida == 1){
            this.ataque = ataque + espadaAtaque;
            this.defesa = defesa + espadaDefesa;
        } else if (armaEscolhida == 2){
            this.ataque = ataque + machadoAtaque;
            this.defesa = defesa + machadoDefesa;
        }
    }

    //@Override
    //public void danoSofrido(int ataque){ }

}
