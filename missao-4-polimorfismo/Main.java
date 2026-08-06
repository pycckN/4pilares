import java.util.List;

public class Main {

    public static void main(String[] args) {

        SuperHeroi heroi = new SuperHeroi("Lisiane Reips", Sexo.MULHER, 1.75, "Fênix", true,
                List.of("super força", "visão de raio-x", "voar", "super velocidade", "sopro congelante")
        );

        Vilao vilao = new Vilao("Doutor Espaguete", Sexo.HOMEM, 1.80, 9
        );

        Civil civil = new Civil("Carlos", Sexo.HOMEM, 1.72
        );

        List<Personagem> personagens = List.of(heroi, vilao, civil
        );


        for (Personagem personagem : personagens) {

            System.out.println(personagem);
            System.out.println(personagem.apresentar());

            personagem.agir();
        }

        System.out.println("Testando as Sobrecargas");

        heroi.usarHabilidade();
        heroi.usarHabilidade(2);
        heroi.usarHabilidade("super velocidade");

        heroi.usarHabilidade(20);
    }
}