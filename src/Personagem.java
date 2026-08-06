public abstract class Personagem {

    protected String nome;
    protected Sexo sexo;
    protected double altura;

    public Personagem(String nome, Sexo sexo, double altura) {
        this.nome = nome;
        this.sexo = sexo;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public double getAltura() {
        return altura;
    }

    public abstract String apresentar();

    public abstract void agir();

    @Override
    public String toString() {
        return "Nome: " + nome + " | Sexo: " + sexo.getDescricao() + " | Altura: " + altura + " m";
    }
}