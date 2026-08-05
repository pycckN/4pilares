import java.util.ArrayList;
import java.util.List;

public class SuperHeroi extends Personagem {

    private String nomeDeGuerra;
    private boolean identidadeSecreta;
    private List<String> habilidades;

    public SuperHeroi(String nome, Sexo sexo, double altura,
                      String nomeDeGuerra, boolean identidadeSecreta, List<String> habilidades) {
        super(nome, sexo, altura);
        this.nomeDeGuerra = nomeDeGuerra;
        this.identidadeSecreta = identidadeSecreta;
        this.habilidades = new ArrayList<>(habilidades);
    }

    public String getNomeDeGuerra() {
        return nomeDeGuerra;
    }

    public String getIdentidade() {
        return identidadeSecreta ? "??? (identidade protegida)" : nome;
    }

    public String revelarIdentidade() {
        return nome;
    }

    public List<String> getHabilidades() {
        return new ArrayList<>(habilidades);
    }

    @Override
    public String apresentar() {
        return nomeDeGuerra + " é um herói com " + habilidades.size() + " habilidade(s).";
    }
}