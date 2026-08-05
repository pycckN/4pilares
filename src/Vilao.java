public class Vilao extends Personagem {

    private int nivelDeAmeaca;

    public Vilao(String nome, Sexo sexo, double altura, int nivelDeAmeaca) {
        super(nome, sexo, altura);
        if (nivelDeAmeaca < 1 || nivelDeAmeaca > 10) {
            throw new IllegalArgumentException("nivelDeAmeaca deve estar entre 1 e 10");
        }
        this.nivelDeAmeaca = nivelDeAmeaca;
    }

    public int getNivelDeAmeaca() {
        return nivelDeAmeaca;
    }

    @Override
    public String apresentar() {
        return nome + " é um vilão, nível de ameaça " + nivelDeAmeaca + ".";
    }
}