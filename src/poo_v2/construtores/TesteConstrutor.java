package poo_v2.construtores;

public class TesteConstrutor {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Joao");
        System.out.println("Nome: \"" + p1.nome + "\" tem " + p1.idade + " anos.");



        Pessoa p2 = new Pessoa("Marisa", 22);
        System.out.println("Nome: \"" + p2.nome + "\" tem " + p2.idade + " anos.");
    }
}
