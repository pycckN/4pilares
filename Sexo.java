public enum Sexo {
    MULHER("Mulher"),
    HOMEM("Homem"),
    OUTRO("Outro"),
    PREFIRO_NAO_DIZER("Prefiro não dizer");

    private final String descricao;

    Sexo(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}