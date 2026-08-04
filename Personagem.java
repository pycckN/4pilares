public abstract class Personagem{
    protected String nome;
    protected Sexo sexo;
    protected double altura;

    public Personagem(String nome, Sexo sexo, double altura){
        this.nome = nome;
        this.altura = altura;
        this.sexo = sexo;

    }
    public abstract String apresentar();
}
