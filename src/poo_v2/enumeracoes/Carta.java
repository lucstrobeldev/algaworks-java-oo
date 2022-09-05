package poo_v2.enumeracoes;

public class Carta {

    private final int numero;
    private final Naipe naipe;

    public Carta(int numero, Naipe naipe) {
        this.numero = numero;
        this.naipe = naipe;
    }

    public void imprimirCart(){
        System.out.println("Sou " + numero + " de " + naipe + ". E tenho a cor: " + naipe.getCor());
    }
}
