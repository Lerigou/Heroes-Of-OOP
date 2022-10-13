import java.util.Scanner;

public class Mago extends Personagem{
    private Arma arma;

    public Mago(){
        super(20, 10, 200);
    }

    @Override
    public void escolherArma() {
        Scanner inputArma = new Scanner(System.in);
        boolean opcaoInvalida;

        do {
            opcaoInvalida = false;
            System.out.println("\033[1;97mEscolha uma das opções de arma: 1 para varinha ou 2 para cajado");
            int armaEscolhida = inputArma.nextInt();
            if (armaEscolhida == 1) {
                arma = new Arma(16, 19, "Varinha");
                System.out.println("\n" +
                        "             *\n" +
                        "       *   *\n" +
                        "     *    \\* / *\n" +
                        "       * --.:. *\n" +
                        "      *   * :\\ -\n" +
                        "        .*  | \\\n" +
                        "       * *     \\\n" +
                        "     .  *       \\\n" +
                        "      ..        /\\.\n" +
                        "     *          |\\)|\n" +
                        "   .   *         \\ |\n" +
                        "  . . *           |/\\\n" +
                        "     .* *         /  \\\n" +
                        "   *              \\ / \\\n" +
                        " *  .  *           \\   \\\n" +
                        "    * .  \n" +
                        "   *    *    \n" +
                        "  .   *    *  ");
            }
            else if (armaEscolhida == 2) {
                arma = new Arma(13, 12, "Cajado");
                System.out.println("\n" +
                        "                   _\n" +
                        "        _..._    /` `\\    _..._\n" +
                        "      .'     '. |     | .'     '.\n" +
                        ",    /         '.\\   /.'         \\    ,\n" +
                        "\\`--'  .--.    .-.> <.-.    .--.  '--`/\n" +
                        " '.__.'    '._/ ^ ) ( ^ \\_.'    '.__.'\n" +
                        "             |  |`| |`|  |\n" +
                        "             \\  \\ | | /  /\n" +
                        "              '. '; ;' .'\n" +
                        "                '. ' .'\n" +
                        "                /  /` \\\n" +
                        "               |  | |  |\n" +
                        "                \\ \\ / /\n" +
                        "                 '.'.'\n" +
                        "                 / Y \\\n" +
                        "                | | | |\n" +
                        "                \\ \\ / /\n" +
                        "                 '.'.'\n" +
                        "                 / / \\\n" +
                        "                (_| |_)\n" +
                        "                  '-'\n");
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
