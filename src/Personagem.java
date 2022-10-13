import java.util.Scanner;

public abstract class Personagem{

    // ele vai ter as ações dos personagens
    // precisa ter um gamecontroller, que é o q vai ser chamado para iniciar o jogo
    // cada personagem (arqueiro, mago etc) vai precisar de uma classe q vai ser ligada a essa classe personagem

    // public void atacar(int atacar) { }

    // public void danoSofrido(int atacar, int defesa){ }

    private int ataque;
    private double defesa;
    private int pontosVida;
    private String nome;
    private double buffDefesa = 0.1;

    public Personagem(int ataque, double defesa, int pontosVida) {
        this.ataque = ataque;
        this.defesa = defesa;
        this.pontosVida = pontosVida;
    }

    public void defender(){
        System.out.println("defendendo");
        setDefesa(getDefesa() * buffDefesa);
    }

    public void escolherNome(){
        System.out.println("Digite seu nome: ");
        Scanner inputNome = new Scanner(System.in);
        // Instanciando a classe scanner dentro da variavel inputNome
        setNome(inputNome.nextLine());
        System.out.println("Seu nome: " + getNome());
    }

    public abstract void escolherArma();

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public double getDefesa() {
        return defesa;
    }

    public void setDefesa(double defesa) {
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
