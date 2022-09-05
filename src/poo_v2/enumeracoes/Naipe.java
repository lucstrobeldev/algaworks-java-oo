package poo_v2.enumeracoes;

public enum Naipe {

    OURO("Vermelho"),
    PAUS("Preto"),
    ESPADA("Preto"),
    COPAS("Vermelho");

    private final String cor;

    Naipe(String cor) {
        this.cor = cor;
    }

    public String getCor(){

        return cor;
    }

}
