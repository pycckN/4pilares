import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Batalha {

    private List<Personagem> participantes;

    public Batalha() {
        participantes = new ArrayList<>();
    }

    public boolean adicionar(Personagem personagem) {

        if (personagem == null) {
            System.out.println("Não foi possível adicionar um personagem vazio.");
            return false;
        }

        if (participantes.contains(personagem)) {
            System.out.println("Esse personagem já está na batalha.");
            return false;
        }

        participantes.add(personagem);
        System.out.println("Personagem adicionado: " + personagem.apresentar());
        return true;
    }

    public void iniciar() {

        if (participantes.isEmpty()) {
            System.out.println("Não existem personagem na batalha.");
            return;
        }

        System.out.println("\n Início da Batalha");

        for (Personagem participante : participantes) {
            System.out.println("\n" + participante.apresentar());
            participante.agir();
        }

        System.out.println("\n Fim da Batalha ");
    }


    public List<SuperHeroi> listarHerois() {

        List<SuperHeroi> herois = new ArrayList<>();

        for (Personagem participante : participantes) {
            if (participante instanceof SuperHeroi) {
                herois.add((SuperHeroi) participante);
            }
        }

        return herois;
    }

    public Personagem maisAlto() {

        if (participantes.isEmpty()) {
            return null;
        }

        Personagem maisAlto = participantes.get(0);

        for (Personagem participante : participantes) {
            if (participante.getAltura() > maisAlto.getAltura()) {
                maisAlto = participante;
            }
        }

        return maisAlto;
    }

    public boolean removerDerrotado(String nomeDeGuerra) {

        if (nomeDeGuerra == null || nomeDeGuerra.isBlank()) {
            System.out.println("Escreva um nome de guerra válido.");
            return false;
        }

        Iterator<Personagem> iterator = participantes.iterator();

        while (iterator.hasNext()) {
            Personagem participante = iterator.next();

            if (participante instanceof SuperHeroi) {
                SuperHeroi heroi = (SuperHeroi) participante;

                if (heroi.getNomeDeGuerra().equalsIgnoreCase(nomeDeGuerra)) {
                    iterator.remove();

                    System.out.println(
                            heroi.getNomeDeGuerra()
                                    + " foi tirado da batalha."
                    );

                    return true;
                }
            }
        }

        System.out.println(
                "Nenhum herói com o nome de guerra \""
                        + nomeDeGuerra + "\" foi encontrado."
        );

        return false;
    }

    public List<Personagem> getParticipantes() {
        return new ArrayList<>(participantes);
    }
}