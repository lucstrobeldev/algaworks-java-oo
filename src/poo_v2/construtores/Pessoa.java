package poo_v2.construtores;

public class Pessoa {

    String nome;

    int idade;

    //SEM O CONSTRUTOR O OBJETO NAO EXISTE
    public Pessoa(String nome) {
        this.nome = nome;

    }

    public Pessoa(String nome, int idade) {
        this(nome); // Deve ser sempre a primeira instrucao dentro do construtor
        // essa inicializacao tem como funcao, chamar o construtor de cima para casos de chamar apenas um construtor na classe
        this.idade = idade;
    }
}
