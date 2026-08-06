public class Civil extends Personagem {

    public Civil(String nome, Sexo sexo, double altura) {
        super(nome, sexo, altura);
    }

    @Override
    public String apresentar() {
        return nome + " é um civil.";
    }

    @Override
    public void agir() {
        System.out.println(nome + " está gritando socorro!");
    }

    @Override
    public String toString() {
        return super.toString() + " | Tipo: Civil";
    }
}