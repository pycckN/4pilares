public class Vilao extends Personagem {

    private int nivelDeAmeaca;

    public Vilao(String nome, Sexo sexo, double altura, int nivelDeAmeaca) {
        super(nome, sexo, altura);

        if (nivelDeAmeaca < 1 || nivelDeAmeaca > 10) {
            throw new IllegalArgumentException(
                    "O nível de ameaça deve estar entre 1 e 10."
            );
        }

        this.nivelDeAmeaca = nivelDeAmeaca;
    }

    public int getNivelDeAmeaca() {
        return nivelDeAmeaca;
    }

    @Override
    public String apresentar() {
        return nome + " é um vilão de ameaça "
                + nivelDeAmeaca + ".";
    }

    @Override
    public void agir() {
        if (nivelDeAmeaca <= 3) {
            System.out.println(nome + " está assustando as pessoas.");
        } else if (nivelDeAmeaca <= 7) {
            System.out.println(nome + " está atacando a cidade.");
        } else {
            System.out.println(
                    nome + " começou um ataque de nível máximo"
            );
        }
    }

    @Override
    public String toString() {
        return super.toString()
                + " | Nível de ameaça: " + nivelDeAmeaca;
    }
}