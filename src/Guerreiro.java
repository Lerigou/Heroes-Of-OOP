import java.util.Scanner;

public class Guerreiro extends Personagem {
    // Guerreiro - ataque: 30; defesa: 20; ponto de vida: 180
    // Armas - Espada ataque: +10; defesa: +15
    // Armas - Machado: ataque: +17; defesa: +8
    private Arma arma;

    public Guerreiro(){
        // o super passa os valores pro construtor da classe personagem
        super(30,20,180);
    }

    @Override
    public void escolherArma() {
        Scanner inputArma = new Scanner(System.in);
        boolean opcaoInvalido;

        do {
            opcaoInvalido = false;
            System.out.println("Escolha uma das opções de arma: 1 para espada ou 2 para machado");
            int armaEscolhida = inputArma.nextInt();
            if (armaEscolhida == 1) { arma = new Arma(10, 15, "Espada"); }
            else if (armaEscolhida == 2) { arma = new Arma(17, 8, "Machado"); }
            else {
                System.out.println("Não existe essa arma");
                opcaoInvalido = true;
            }
        } while (opcaoInvalido);

        setAtaque(arma.getAtaqueArma() + getAtaque());
        setDefesa(arma.getDefesaArma() + getDefesa());
        System.out.println("Você escolheu a arma " + arma.getNome() + " dando um buff de " + arma.getAtaqueArma()
                + " no ataque total \ne " + arma.getDefesaArma() + " na defesa total, totalizando em um ataque de "
                + getAtaque() + " e em uma defesa de " + getDefesa());


    }
}
