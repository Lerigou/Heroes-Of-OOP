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
        setDefesa(getDefesa() + (getDefesa() * buffDefesa));
    }

    // Método para escolha do nome, onde um scanner é criado
    // Para usar/pegar o que foi inserido no scanner é preciso utilizar o nextLine(), para Strins
    public void escolherNome(){
        System.out.println("Escolha um nome para o seu personagem: ");
        // Instanciando o objeto Scanner
        Scanner inputNome = new Scanner(System.in);
        // Instanciando o objeto scanner dentro da variavel inputNome
        setNome(inputNome.nextLine());
        System.out.println("Seu personagem se chama: " + getNome());
    }

    // Método abstrato
    public abstract void escolherArma();

    public void escolherPersonagem() {

        int idPersonagem = 0;
        boolean adicionarPersonagem;

        do {
            adicionarPersonagem = true;
            idPersonagem += 1;
            System.out.println("\033[1;97mPersonagem de número: " + idPersonagem + '\n');

            System.out.println("\033[1;97mEscolha um personagem dentre as opções: \n" +
                    "Personagem 1: Guerreiro | Ataque: 30 | Defesa: 20 | PVD: 180 \n" +
                    "Personagem 2: Mago | Ataque: 20 |  Defesa 10 | PVD: 200 \n" +
                    "Personagem 3: Arqueiro | Ataque: 20 | Defesa: 30 | PVD: 160");

            Scanner personagemEscolhido = new Scanner(System.in);
            int escolha = personagemEscolhido.nextInt();

            switch (escolha){
                case 1:
                    System.out.println("\033[1;97m\n" +
                            "Você escolheu o personagem 1: Guerreiro \n" +
                            "\033[1;31mAtaque: 30\n" +
                            "\033[1;36mDefesa: 20\n" +
                            "\033[1;32mPVD: 180\033" +
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
                            "               /____/\\____\\");
                    escolherNome();
                    escolherArma();
                    break;

                case 2:
                    System.out.println("\033[1;97m\n" +
                            "Você escolheu o personagem 2: Mago \n" +
                            "\033[1;Ataque: 20 \n" +
                            "\033[1;Defesa: 10 \n" +
                            "\033[1;PVD: 200 \n" +
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
                    escolherNome();
                    escolherArma();
                    break;

                case 3:
                    System.out.println("\033[1;97m\n" +
                            "Você escolheu o personagem 3: Arqueiro \n" +
                            "\033[1;Ataque: 20 \n" +
                            "\033[1;Defesa: 30 \n" +
                            "\033[1;PVD: 160 \n" +
                            "\033[1;97m\n" +
                            "                                                 |\n" +
                            "                                                         \\.\n" +
                            "                                                         /|.\n" +
                            "                                                       /  `|.\n" +
                            "                                                     /     |.\n" +
                            "                                                   /       |.\n" +
                            "                                                 /         `|.\n" +
                            "                                               /            |.\n" +
                            "                                             /              |.\n" +
                            "                                           /                |.\n" +
                            "      __                                 /                  `|.\n" +
                            "       -\\                              /                     |.\n" +
                            "         \\\\                          /                       |.\n" +
                            "           \\\\                      /                         |.\n" +
                            "            \\|                   /                           |\\\n" +
                            "              \\#####\\          /                             ||\n" +
                            "          ==###########>     /                               ||\n" +
                            "           \\##==      \\    /                                 ||\n" +
                            "      ______ =       =|__/___                                ||\n" +
                            "  ,--' ,----`-,__ ___/'  --,-`-==============================##==========>\n" +
                            " \\               '        ##_______ ______   ______,--,____,=##,__\n" +
                            "  `,    __==    ___,-,__,--'#'  ==='      `-'              | ##,-/\n" +
                            "    `-,____,---'       \\####\\              |        ____,--\\_##,/\n" +
                            "        #_              |##   \\  _____,---==,__,---'         ##\n" +
                            "         #              ]===--==\\                            ||\n" +
                            "         #,             ]         \\                          ||\n" +
                            "          #_            |           \\                        ||\n" +
                            "           ##_       __/'             \\                      ||\n" +
                            "            ####='     |                \\                    |/\n" +
                            "             ###       |                  \\                  |.\n" +
                            "             ##       _'                    \\                |.\n" +
                            "            ###=======]                       \\              |.\n" +
                            "           ///        |                         \\           ,|.\n" +
                            "           //         |                           \\         |.\n" +
                            "                                                    \\      ,|.\n" +
                            "                                                      \\    |.\n" +
                            "                                                        \\  |.\n" +
                            "                                                          \\|.\n" +
                            "                                                          /.\n" +
                            "                                                         |");
                    escolherNome();
                    escolherArma();
                    break;
                default:
                    System.out.println("\033[1;97mOpção indisponível! Por favor, escolha uma das opções indicadas");
            }

            int qtdMax = 3;
            if (idPersonagem >= qtdMax){
                System.out.println("\033[1;97mLimite de personagens atingido!");
                adicionarPersonagem = false;
                break;
                // colocar o método que vai iniciar o jogo
            }

            System.out.println("\033[1; adicionar um novo personagem? \n" +
                    "\033[1;32m1- Para adicionar um novo personagem \n" +
                    "\033[1;31m2- Para não adicionar um novo personagem");

            Scanner novoPersonagem = new Scanner(System.in);
            int criarPersonagem = novoPersonagem.nextInt();

            if (criarPersonagem == 2){
                adicionarPersonagem = false;
                // Aí aqui ele chama o método pra iniciar o jogo
            }

        } while (adicionarPersonagem == true);

    }

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
