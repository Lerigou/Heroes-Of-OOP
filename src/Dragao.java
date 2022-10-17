import java.util.ArrayList;
import java.util.Random;

public class Dragao extends Personagem {
    // Dragão - ataque: 30; defesa: 30; ponto de vida: 300
    // private final int ataque = 30;
    // private final int defesa = 30;
    // private int ptsVida = 300;

    private String nome = "LazyProg";

    public Dragao() {
        super(30, 30, 300);
    }

    @Override
    public void atacar(Personagem personagem) {
        int dano;
        
        //RANDOMIZAR FALA DO ATAQUE DADO PELO DRAGÃO
        final String[] falasDragao = {"ataca ferozmente com um bafo congelante."
        , "joga uma arvore caida em sua direcao."
        , "ataca com suas garras afiadas e mortais."
        , "joga heroi para longe."};
        Random random = new Random();
        int falaN = random.nextInt(falasDragao.length);

        System.out.println("\033[4;31mO Dragao "+ falasDragao[falaN]+"\033[0m\n\033[1;97m");
        dano = getAtaque() - personagem.getDefesa();

        // Verifica se o dano for maior que zero, caso seja, ele faz o cálculo do dano, atualizando a nova vida do personagem que tomou dano
        if (dano > 0){
            personagem.setPontosVida(personagem.getPontosVida() - dano);
            System.out.println("- - - - - - - - - - - - - - - - - -\nDano causado: " + dano + "| Vida total de " +personagem.getNome()+": " + personagem.getPontosVida()+"\n- - - - - - - - - - - - - - - - - -");
        } else {
            System.out.println("Uau! Voce neutralizou o ataque! Se livrando de um golpe de " + dano + " Sua vida agora é: " + personagem.getPontosVida());
        }
    } // Fim do método  atacar


    // Método que escolhe randomicamente um personagem dentro do array
    public Personagem prepararAtaque(ArrayList<Personagem> personagens) {
        int max = personagens.size() - 1;
        int min = 0;
        int range = max - min + 1;
        int posicaoArray = (int) (Math.random() * range);

        System.out.println("\nO dragao, com muita raiva, se vira para " + personagens.get(posicaoArray).getNome()
                + " e o escolhe como proximo alvo.");
        return personagens.get(posicaoArray);
    } // Fim do método prepararAtaque
}
