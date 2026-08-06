import java.util.ArrayList;
import java.util.List;

public class SuperHeroi extends Personagem {

    private String nomeDeGuerra;
    private boolean identidadeSecreta;
    private List<String> habilidades;

    public SuperHeroi(String nome, Sexo sexo, double altura, String nomeDeGuerra, boolean identidadeSecreta, List<String> habilidades)
    {
        super(nome, sexo, altura);
        this.nomeDeGuerra = nomeDeGuerra;
        this.identidadeSecreta = identidadeSecreta;
        this.habilidades = new ArrayList<>(habilidades);
    }

    public String getNomeDeGuerra() {
        return nomeDeGuerra;
    }

    public String getIdentidade() {
        return identidadeSecreta
                ? "??? (identidade protegida e oculta)"
                : nome;
    }

    public String revelarIdentidade() {
        return nome;
    }

    public List<String> getHabilidades() {
        return new ArrayList<>(habilidades);
    }

    @Override
    public String apresentar() {
        return nomeDeGuerra + " é um super-herói com a "
                + habilidades.size() + " habilidade.";
    }

    @Override
    public void agir() {
        System.out.println(nomeDeGuerra + " Está protegendo a cidade.");
        usarHabilidade();
    }

    public void usarHabilidade() {
        if (habilidades.isEmpty()) {
            System.out.println(nomeDeGuerra + " não possui habilidades.");
            return;
        }

        System.out.println(
                nomeDeGuerra + " utilizou a habilidade: " + habilidades.get(0)
        );
    }

    public void usarHabilidade(int indice) {
        if (indice < 0 || indice >= habilidades.size()) {
            System.out.println(
                    "Índice inválido. Selecione um valor entre 0 e "
                            + (habilidades.size() - 1) + "."
            );
            return;
        }

        System.out.println(
                nomeDeGuerra + " usou a habilidade: " + habilidades.get(indice)
        );
    }

    public void usarHabilidade(String nomeHabilidade) {
        for (String habilidade : habilidades) {
            if (habilidade.equalsIgnoreCase(nomeHabilidade)) {
                System.out.println(
                        nomeDeGuerra + " usou a habilidade: " + habilidade
                );
                return;
            }
        }

        System.out.println(
                "A habilidade \"" + nomeHabilidade + "\" não foi encontrada."
        );
    }

    @Override
    public String toString() {
        return super.toString()
                + " | Nome de guerra: " + nomeDeGuerra
                + " | Habilidades: " + habilidades;
    }
}