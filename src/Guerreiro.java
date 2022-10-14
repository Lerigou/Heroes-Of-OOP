import java.util.Scanner;

public class Guerreiro extends Personagem {
    private Arma arma;

    public Guerreiro(){
        // o super passa os valores pro construtor da classe personagem
        super(30,20,180);
    }

    public void escolherArma() {
        Scanner inputArma = new Scanner(System.in);
        boolean opcaoInvalida;

        do {
            opcaoInvalida = false;
            System.out.println("\033[1;97mEscolha uma das opções de arma: 1 para espada ou 2 para machado");
            int armaEscolhida = inputArma.nextInt();
            if (armaEscolhida == 1) {
                arma = new Arma(10, 15, "Espada");
                System.out.println("\n" +
                        "                   {}\n" +
                        "                  .--.\n" +
                        "                 /.--.\\\n" +
                        "                 |====|\n" +
                        "                 |`::`|\n" +
                        "             .-;`\\..../`;_.-^-._\n" +
                        "      /\\\\   /  |...::..|`   :   `|\n" +
                        "      |:'\\ |   /'''::''|   .:.   |\n" +
                        "     @|\\ /\\;-,/\\   ::  |..:::::..|\n" +
                        "     `||\\ <` >  >._::_.| ':::::' |\n" +
                        "      || `\"\"`  /   ^^  |   ':'   |\n" +
                        "      ||       |       \\    :    /\n" +
                        "      ||       |        \\   :   / \n" +
                        "      ||       |___/\\___|`-.:.-`\n" +
                        "      ||        \\_ || _/    `\n" +
                        "      ||        <_ >< _>\n" +
                        "      ||        |  ||  |\n" +
                        "      ||        |  ||  |\n" +
                        "      ||       _\\.:||:./_\n" +
                        "      \\/      /____/\\____\\");
            }
            else if (armaEscolhida == 2) {
                arma = new Arma(17, 8, "Machado");
                System.out.println("\n" +
                        "   ,   A           {}\n" +
                        "  / \\, | ,        .--.\n" +
                        " |    =|= >      /.--.\\\n" +
                        "  \\ /` | `       |====|\n" +
                        "   `   |         |`::`|  \n" +
                        "       |     .-;`\\..../`;_.-^-._\n" +
                        "      /\\\\/  /  |...::..|`   :   `|\n" +
                        "      |:'\\ |   /'''::''|   .:.   |\n" +
                        "       \\ /\\;-,/\\   ::  |..:::::..|\n" +
                        "       |\\ <` >  >._::_.| ':::::' |\n" +
                        "       | `\"\"`  /   ^^  |   ':'   |\n" +
                        "       |       |       \\    :    /\n" +
                        "       |       |        \\   :   / \n" +
                        "       |       |___/\\___|`-.:.-`\n" +
                        "       |        \\_ || _/    `\n" +
                        "       |        <_ >< _>\n" +
                        "       |        |  ||  |\n" +
                        "       |        |  ||  |\n" +
                        "       |       _\\.:||:./_\n" +
                        "       |      /____/\\____\\");
            }
            else {
                System.out.println("Não existe essa arma");
                opcaoInvalida = true;
            }
        } while (opcaoInvalida);

        setAtaque(arma.getAtaqueArma() + getAtaque());
        setDefesa(arma.getDefesaArma() + getDefesa());
        System.out.println("\033[1;97mVocê escolheu a arma " + arma.getNome() + "\n" +
                "\033[1;93m+buff de " + arma.getAtaqueArma()+ " no ataque total \n" +
                "\033[1;93m+buff de " + arma.getDefesaArma() + " na defesa total \n" +
                "\033[1;97mTotalizando em um ataque de " + getAtaque() + " e em uma defesa de " + getDefesa() + '\n');
    }
}
