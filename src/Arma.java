public class Arma {
    private int ataqueArma;
    private int defesaArma;
    private String nome;

    public Arma(int ataqueArma, int defesaArma, String nome) {
        this.ataqueArma = ataqueArma;
        this.defesaArma = defesaArma;
        this.nome = nome;
    }

    public int getAtaqueArma() {
        return ataqueArma;
    }

    public void setAtaqueArma(int ataqueArma) {
        this.ataqueArma = ataqueArma;
    }

    public int getDefesaArma() {
        return defesaArma;
    }

    public void setDefesaArma(int defesaArma) {
        this.defesaArma = defesaArma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
