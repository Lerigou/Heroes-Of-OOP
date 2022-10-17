import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public abstract class Personagem{

    // ele vai ter as ações dos personagens
    // precisa ter um gamecontroller, que é o q vai ser chamado para iniciar o jogo
    // cada personagem (arqueiro, mago etc) vai precisar de uma classe q vai ser ligada a essa classe personagem

    // public void atacar(int atacar) { }

    // public void danoSofrido(int atacar, int defesa){ }

    private int dano;
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

    public abstract void defender(Dragao dragao);

    public abstract void atacar(Dragao dragao);

    // Método para escolha do nome, onde um scanner é criado
    // Para usar/pegar o que foi inserido no scanner é preciso utilizar o nextLine(), para Strins

    public int getDano() {
        return ataque;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

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
