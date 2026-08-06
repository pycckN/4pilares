import java.util.List;

public class Main {

    public static void main(String[] args) {

        SuperHeroi fenix = new SuperHeroi(
                "Lisiane Reips", Sexo.MULHER, 1.75, "Fênix", true,
                List.of("super força", "visão de raio-x", "voar", "super velocidade", "sopro congelante")
        );

        SuperHeroi tempestade = new SuperHeroi("Maria Ferreira", Sexo.MULHER, 1.69, "Tempestade de Neve", true,
                List.of("controlar o vento", "controlar a neve", "deslizar")
        );

        Vilao doutorEstranho = new Vilao("Doutor Estranho", Sexo.HOMEM, 1.81, 9
        );

        Vilao corvo = new Vilao("Corvo", Sexo.HOMEM, 1.92, 7
        );

        Civil Joao = new Civil("João", Sexo.HOMEM, 1.72
        );

        Civil Sophia = new Civil("Sophia", Sexo.MULHER, 1.65
        );

        Batalha batalha = new Batalha();

        System.out.println("Adicionando os Personagens");

        batalha.adicionar(fenix);
        batalha.adicionar(tempestade);
        batalha.adicionar(doutorEstranho);
        batalha.adicionar(corvo);
        batalha.adicionar(Joao);
        batalha.adicionar(Sophia);

        batalha.adicionar(fenix);


        batalha.adicionar(null);

        batalha.iniciar();

        System.out.println("\n Lista dos Heróis");

        for (SuperHeroi heroi : batalha.listarHerois()) {
            System.out.println(heroi);
        }

        System.out.println("\n Personagem mais alto");

        Personagem participanteMaisAlto = batalha.maisAlto();

        if (participanteMaisAlto != null) {
            System.out.println(participanteMaisAlto);
        }

        System.out.println("\n Removovendo o Perdedor");

        batalha.removerDerrotado("Fênix");

        System.out.println("\n Batalha após a removoção");

        batalha.iniciar();
    }
}