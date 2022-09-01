package poo_v2.encapsulamento_modificadores_publico_private;

public class TesteEncapsulamento {
    public static void main(String[] args) {
        // uma classe que mostra muito dela, nao é uma classe encapsulada
        ArCondicionado ar = new ArCondicionado();

        ar.trocarTemperadura(21);
        System.out.println("Temperatura do ar: " + ar.obterTemperatura() + "C");

        ar.trocarTemperadura(10);
        System.out.println("Temperatura do ar: " + ar.obterTemperatura() + "C");
    }
}
