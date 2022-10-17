import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public abstract class Personagem{

    // ele vai ter as ações dos personagens
    // precisa ter um gamecontroller, que é o q vai ser chamado para iniciar o jogo
    // cada personagem (arqueiro, mago etc) vai precisar de uma classe q vai ser ligada a essa classe personagem

    // public void atacar(int atacar) { }

    // public void danoSofrido(int atacar, int defesa){ }


    private int ataque;
    private int defesa;
    private int pontosVida;
    public String nome;
    private double buffDefesa = 0.1;

    public Personagem(int ataque, int defesa, int pontosVida) {
        this.ataque = ataque;
        this.defesa = defesa;
        this.pontosVida = pontosVida;
    }

    public abstract void atacar(Personagem personagem);
    public void defender(){
        //RANDOMIZAR FALA DE DEFESA
        final String[] falasDefesa = {"esquiva para longe do dragao."
        , "faz um rolamento para longe."
        , "se esconde atras da arvore mais proxima."
        , "corre do dragao."};
        Random random = new Random();
        int falaN = random.nextInt(falasDefesa.length);

        System.out.println("\n\033[4;34mO heroi "+ falasDefesa[falaN]+"\033[0m\033[1;97m\n\n- - - - - - - - - - - - - - - - - -");
        setDefesa(getDefesa() + (getDefesa() * ((10/100) * getDefesa())));
    }


    // Método para escolha do nome, onde um scanner é criado
    // Para usar/pegar o que foi inserido no scanner é preciso utilizar o nextLine(), para Strins

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getPontosVida() {
        return pontosVida;
    }

    public void setPontosVida(int pontosVida) {
        this.pontosVida = pontosVida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
