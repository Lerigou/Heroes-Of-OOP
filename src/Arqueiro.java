import java.util.Scanner;

public class Arqueiro extends Personagem{
    // Arqueiro - ataque: 20; defesa: 30; ponto de vida: 160
    // Armas - Arco longo ataque: +12; defesa: +13
    // Armas - Balestra: ataque: +15; defesa: +10

    private Arma arma;

    public Arqueiro(){
        super(20, 30, 160);
    }

    @Override
    public void escolherArma() {
        Scanner inputArma = new Scanner(System.in);
        boolean opcaoInvalida;

        do {
            opcaoInvalida = false;
            System.out.println("\033[1;97mEscolha uma das opções de arma: 1 para arco longo ou 2 para balestra");
            int armaEscolhida = inputArma.nextInt();
            if (armaEscolhida == 1) {
                arma = new Arma(12, 13, "Arco Longo");
                System.out.println("\n" +
                        "        4$$-.\n" +
                        "             4   \".\n" +
                        "             4    ^.\n" +
                        "             4     $\n" +
                        "             4     'b\n" +
                        "             4      \"b.\n" +
                        "             4        $\n" +
                        "             4        $r\n" +
                        "             4        $F\n" +
                        "  -$b========4========$b====*P=-\n" +
                        "             4       *$$F\n" +
                        "             4        $$\"\n" +
                        "             4       .$F\n" +
                        "             4       dP\n" +
                        "             4      F\n" +
                        "             4     @\n" +
                        "             4    .\n" +
                        "             J.\n" +
                        "            '$$          '");
            }
            else if (armaEscolhida == 2) {
                arma = new Arma(15, 10, "Balestra");
                System.out.println("\n" +
                        "   (\n" +
                        "    \\n" +
                        "    | \\n" +
                        "    |  \\\n" +
                        "    |   )\n" +
                        "##-------------->        \n" +
                        "    |   )\n" +
                        "    |  /\n" +
                        "    | /\n" +
                        "    |/\n" +
                        "    /\n" +
                        "   (");
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
