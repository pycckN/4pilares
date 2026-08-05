import java.util.List;

public class Main {
    public static void main(String[] args) {
        SuperHeroi heroi = new SuperHeroi(
                "Lisiane Reips", Sexo.MULHER, 1.75,
                "Fenix", true,
                List.of("super força", "visão de raio-x", "voar", "super velocidade", "sopro congelante")
        );
        System.out.println(heroi.apresentar());

        Vilao vilao = new Vilao("Doutor Espaguete", Sexo.HOMEM, 1.80, 9);
        System.out.println(vilao.apresentar());
    }
}