import java.util.ArrayList;
import java.util.Scanner;

public class MenusController {

    // Menu1 -> É o menu para o usuário, ele pergunta se o usuário deseja iniciar
    // uma nova partida(leva ao menu2) ou sair do jogo
    // Menu2 -> Criar novo personagem(nome e tipo de personagem, tipo de arma(if
    // else de acordo com a resposta do personagem)
    // o usuário pode criar até 3 personagens, começar a partida ou sair do jogo
    // Menu4 ->
    private ArrayList<Personagem> personagens;
    int qtdPersonagens = 0;

    public MenusController() {
        personagens = new ArrayList<>();
        Personagem dragao = new Dragao();
    }

    public void home() {
        System.out.println("\033[1;97m\n" +
                " _____                            ___    _____ _____ _____ \n" +
                "|  |  |___ ___ ___ ___ ___    ___|  _|  |     |     |  _  |\n" +
                "|     | -_|  _| . | -_|_ -|  | . |  _|  |  |  |  |  |   __|\n" +
                "|__|__|___|_| |___|___|___|  |___|_|    |_____|_____|__|" +
                "\n");
        System.out.println("\033[1;97mDeseja iniciar uma nova partida ou sair? \n" +
                "1- Nova partida\n" +
                "\033[1;91m2- Sair \033[1;97m");
        Scanner menu1 = new Scanner(System.in);
        int escolha = menu1.nextInt();

        if (escolha == 1) {
            System.out.println("Eba");
            qtdPersonagens = 0;
            criarPersonagem(personagens);
        } else if (escolha == 2) {
            System.out.println("Ta bom, tchau!");
            //home();
        }
    }

    public void escolherNome(Personagem p) {
        System.out.println("Escolha um nome para o seu personagem: ");
        Scanner inputNome = new Scanner(System.in);
        String nome = inputNome.nextLine();
        p.setNome(nome);

        //Validação de nome
       if (p.getNome().isEmpty()){
        System.out.println("Nome inválido. Começe novamente.\n\n-------\n\n");
        escolherNome(personagens.get(qtdPersonagens));
       }else{
        //Validação de nome já existente
        for(int i = 0; i < qtdPersonagens; ++i){
            if(personagens.get(i).getNome().equals(nome)){
                System.out.println("Nome já informado!");
                escolherNome(personagens.get(qtdPersonagens));
                        
            }else{
                System.out.println("Seu personagem se chama: " + p.getNome());
            }
            
        }
       }
    }

    public void criarPersonagem(ArrayList<Personagem> personagens) {
        boolean adicionarPersonagem;
        int qtdMax = 3;

        do {
            adicionarPersonagem = true;
            System.out.println("\033[1;97mPersonagem de número: " + qtdPersonagens + '\n');

            System.out.println("\033[1;97mEscolha um personagem dentre as opções: \n" +
                    "Personagem 1: Guerreiro | Ataque: 30 | Defesa: 20 | PVD: 180 \n" +
                    "Personagem 2: Mago | Ataque: 20 |  Defesa 10 | PVD: 200 \n" +
                    "Personagem 3: Arqueiro | Ataque: 20 | Defesa: 30 | PVD: 160");

            Scanner personagemEscolhido = new Scanner(System.in);
            int escolha = personagemEscolhido.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("\033[1;97m\n" +
                            "Você escolheu o personagem 1: Guerreiro \n" +
                            "\033[1;91mAtaque: 30\n" +
                            "\033[1;96mDefesa: 20\n" +
                            "\033[1;92mPVD: 180 \n" +
                            "\033[1;97m\n" +
                            "                   {}\n" +
                            "                  .--.\n" +
                            "                 /.--.\\\n" +
                            "                 |====|\n" +
                            "                 |`::`|  \n" +
                            "             .-;`\\..../`;_.-^-._\n" +
                            "            /  |...::..|`   :   `|\n" +
                            "           |   /'''::''|   .:.   |\n" +
                            "           ;--'\\   ::  |..:::::..|\n" +
                            "           <__> >._::_.| ':::::' |\n" +
                            "           |  |/   ^^  |   ':'   |\n" +
                            "           \\::/|       \\    :    /\n" +
                            "           |||\\|        \\   :   / \n" +
                            "           ''' |___/\\___|`-.:.-`\n" +
                            "                \\_ || _/    `\n" +
                            "                <_ >< _>\n" +
                            "                |  ||  |\n" +
                            "                |  ||  |\n" +
                            "               _\\.:||:./_\n" +
                            "              /____/\\____\\");
                    personagens.add(new Guerreiro());
                    break;

                case 2:
                    System.out.println("\033[1;97m\n" +
                            "Você escolheu o personagem 2: Mago \n" +
                            "\033[1;91mAtaque: 20 \n" +
                            "\033[1;96mDefesa: 10 \n" +
                            "\033[1;92mPVD: 200 \n" +
                            "\033[1;97m\n " +
                            "                     ____ \n" +
                            "                  .'* *.'\n" +
                            "               __/_*_*(_\n" +
                            "              / _______ \\\n" +
                            "             _\\_)/___\\(_/_ \n" +
                            "            / _((\\- -/))_ \\\n" +
                            "            \\ \\())(-)(()/ /\n" +
                            "             ' \\(((()))/ '\n" +
                            "            / ' \\)).))/ ' \\\n" +
                            "           / _ \\ - | - /_  \\\n" +
                            "          (   ( .;''';. .'  )\n" +
                            "          _\\\"__ /    )\\ __\"/_\n" +
                            "            \\/  \\   ' /  \\/\n" +
                            "             .'  '...' ' )\n" +
                            "              / /  |  \\ \\\n" +
                            "             / .   .   . \\\n" +
                            "            /   .     .   \\\n" +
                            "           /   /   |   \\   \\\n" +
                            "         .'   /    b    '.  '.\n" +
                            "     _.-'    /     Bb     '-. '-._ \n" +
                            " _.-'       |      BBb       '-.  '-. \n" +
                            "(___________\\____.dBBBb.________)____)");
                    personagens.add(new Mago());
                    break;

                case 3:
                    System.out.println("\033[1;97m\n" +
                            "Você escolheu o personagem 3: Arqueiro \n" +
                            "\033[1;91mAtaque: 20 \n" +
                            "\033[1;96mDefesa: 30 \n" +
                            "\033[1;92mPVD: 160 \n" +
                            "\033[1;97m\n" +
                            "            /`.                      \n" +
                            "           /   :.                        \n" +
                            "          /     \\\\                      \n" +
                            "       ,;/,      ::              \n" +
                            "   ___:c/.(      ||                     \n" +
                            " ,'  _|:)>>>--,-'B)>                    \n" +
                            "(  '---'\\--'` _,'||                     \n" +
                            " `--.    \\ ,-'   ;;                    \n" +
                            "     |    \\|    //                 \n" +
                            "     |     \\   ;'                 \n" +
                            "     |_____|\\,'                          \n" +
                            "     :     :                             \n" +
                            "     |  ,  |                             \n" +
                            "     | : \\ :                             \n" +
                            "     | | : :                             \n" +
                            "     | | | |                            \n" +
                            "     | | |_`.                   \n" +
                            "     '--`                             \n");
                    personagens.add(new Arqueiro());
                    break;
                default:
                    System.out.println("\033[1;97mOpção indisponível! Por favor, escolha uma das opções indicadas");
            }

            escolherNome(personagens.get(qtdPersonagens));
            escolherArma(personagens.get(qtdPersonagens));
            qtdPersonagens += 1;

            if (qtdPersonagens >= qtdMax) {
                System.out.println("\033[1;97mLimite de personagens atingido!");
                adicionarPersonagem = false;
                iniciarJogo();
                break;
            }

            System.out.println("\033[1;97mDeseja adicionar um novo personagem? \n" +
                    "\033[1;32m1- Para adicionar um novo personagem \n" +
                    "\033[1;31m2- Para não adicionar um novo personagem");

            Scanner novoPersonagem = new Scanner(System.in);
            int criarPersonagem = novoPersonagem.nextInt();

            if (criarPersonagem == 2) {
                adicionarPersonagem = false;
                iniciarJogo();
            }

        } while (adicionarPersonagem == true);

    } // Aqui termina o método escolherPersonagem :)

    public void escolherArma(Personagem p) {
        Scanner inputArma = new Scanner(System.in);
        boolean opcaoInvalida;
        Arma arma = new Arma(0, 0, " ");

        if (p.getClass().getSimpleName() == "Guerreiro") {
            do {
                opcaoInvalida = false;
                System.out.println("\033[1;97mEscolha uma das opções de arma: 1 para espada ou 2 para machado");
                int armaEscolhida = inputArma.nextInt();
                if (armaEscolhida == 1) {
                    arma = new Arma(10, 15, "Espada");
                    System.out.println("\n" +
                            "        )         \n" +
                            "          (            \n" +
                            "        '    }      \n" +
                            "      (    '      \n" +
                            "     '      (   \n" +
                            "      )  |    ) \n" +
                            "    '   /|\\    `\n" +
                            "   )   / | \\  ` )   \n" +
                            "  {    | | |  {   \n" +
                            " }     | | |  .\n" +
                            "  '    | | |    )\n" +
                            " (    /| | |\\    .\n" +
                            "  .  / | | | \\  (\n" +
                            "}    \\ \\ | / /  .        \n" +
                            " (    \\ `-' /    }\n" +
                            " '    / ,-. \\    ' \n" +
                            "  }  / / | \\ \\  }\n" +
                            " '   \\ | | | /   } \n" +
                            "  (   \\| | |/  (\n" +
                            "    )  | | |  )\n" +
                            "    .  | | |  '\n" +
                            "       J | L\n" +
                            " /|    J_|_L    |\\\n" +
                            " \\ \\___/ o \\___/ /\n" +
                            "  \\_____ _ _____/\n" +
                            "        |-|\n" +
                            "        |-|\n" +
                            "        |-|\n" +
                            "       ,'-'.\n" +
                            "       '---'");
                } else if (armaEscolhida == 2) {
                    arma = new Arma(17, 8, "Machado");
                    System.out.println("\n" +
                            "                     _,,--.._\n" +
                            "                    /. ` ` .  `.\n" +
                            "                    )|       `  `.\n" +
                            "       .           / |         `  `\n" +
                            "        `.        / /            ` `\n" +
                            "         `.`.    / /              ` `\n" +
                            "           `.`.'' /                ' :\n" +
                            "            <','/'`                . ;\n" +
                            "           ,-'.-    `             , /\n" +
                            "       _.-',-^`       `      _.-----\n" +
                            " /`==::.,-'     `       ` ,-'\n" +
                            "/ /               `     .;\n" +
                            "| |..               ` .,' `.\n" +
                            "| ':`....---.       ,'`'.   `.\n" +
                            " .`:.:.:.:.:-..    /     `.   `.\n" +
                            "  .`ccoccoccoc'``./        `.   `.\n" +
                            "   `.`CQCCQCCCQCC/           `.   `.\n" +
                            "     `.`8O8O8O8O8(             `.   `.\n" +
                            "       `.`_-_@-@_-;              `. .'\"'.\n" +
                            "            '\"\"'                   :,' ,--'\n" +
                            "                                    `.` _,--\n" +
                            "             A                        `.  _,',.\n" +
                            "            (@)                         `. .-' `_\n" +
                            "                                          `. ,-^.`.\n" +
                            "               A                            `. - _.-.\n" +
                            "              (@)                             `.', ,'-\n" +
                            "                                                `. _,-`__\n" +
                            "                                                  `. _-,`|\n" +
                            "                                                    |,_-`|\n" +
                            "                                                    '----'\n");
                    // TODO procurar armas avulsas, pra padronizar com o mago e com o arqueiro
                } else {
                    System.out.println("Não existe essa arma");
                    opcaoInvalida = true;
                }
            } while (opcaoInvalida);

        } else if (p.getClass().getSimpleName() == "Mago") {
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
                } else if (armaEscolhida == 2) {
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
                } else {
                    System.out.println("Não existe essa arma");
                    opcaoInvalida = true;
                }
            } while (opcaoInvalida);
        } else if (p.getClass().getSimpleName() == "Arqueiro") {
            do {
                opcaoInvalida = false;
                System.out.println("\033[1;97mEscolha uma das opções de arma: 1 para arco longo ou 2 para balestra");
                int armaEscolhida = inputArma.nextInt();
                if (armaEscolhida == 1) {
                    arma = new Arma(12, 13, "Arco Longo");
                    System.out.println("\n" +
                            "             4$$-.\n" +
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
                            "             4.\n" +
                            "            '$$          '");
                } else if (armaEscolhida == 2) {
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
                } else {
                    System.out.println("Não existe essa arma");
                    opcaoInvalida = true;
                }
            } while (opcaoInvalida);
        }

        p.setAtaque(arma.getAtaqueArma() + p.getAtaque());
        p.setDefesa(arma.getDefesaArma() + p.getDefesa());
        System.out.println("\033[1;97mVocê escolheu a arma " + arma.getNome() + "\n" +
                "\033[1;93m+buff de " + arma.getAtaqueArma() + " no ataque total \n" +
                "\033[1;93m+buff de " + arma.getDefesaArma() + " na defesa total \n" +
                "\033[1;97mTotalizando em um ataque de " + p.getAtaque() + " e em uma defesa de " + p.getDefesa()
                + '\n');
    }

    //Fim do metodo Escolher Arma

    public void iniciarJogo() {
        turno(personagens, new Dragao());
    }

    public void turno (ArrayList<Personagem> personagens, Dragao dragao) {
        for (Personagem personagem: personagens){
            System.out.println("Atacar ou defender?");
            Scanner atqDef = new Scanner(System.in);
            int escolhaTurno = atqDef.nextInt();
            boolean escolhaInvalida = true;

            while(escolhaInvalida == true) {
                if (escolhaTurno == 1) {
                    personagem.atacar(dragao);
                    escolhaInvalida = false;
                } else if (escolhaTurno == 2) {
                    personagem.defender();
                    escolhaInvalida = false;
                } else {
                    System.out.println("Escolha inválida!");
                    escolhaInvalida = true;
                }
            }

        }
        dragao.ataqueDragao(personagens);
    }
}
