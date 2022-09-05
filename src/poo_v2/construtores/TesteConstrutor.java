package poo_v2.construtores;

public class TesteConstrutor {
    public static void main(String[] args) {

        System.out.println();

        Pessoa p1 = new Pessoa("Joao");
        System.out.println("Nome: \"" + p1.nome + "\" tem " + p1.idade + " anos.");



        Pessoa p2 = new Pessoa("Marisa", 22);
        System.out.println("Nome: \"" + p2.nome + "\" tem " + p2.idade + " anos.");
    }
    //SEM O CONSTRUTOR O OBJETO NAO EXISTE
    //Em Java, o construtor é definido como um método cujo nome deve ser o mesmo nome da classe e sem indicação do tipo de retorno
    // -- nem mesmo void. O construtor é unicamente invocado no momento da criação do objeto através do operador new.
    // O retorno do operador new é uma referência para o objeto recém-criado.
}
