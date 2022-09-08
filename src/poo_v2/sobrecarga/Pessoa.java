package poo_v2.sobrecarga;

public class Pessoa {

    private String nome;
    private int idade;


    //construtor para que faz com que o objeto Pessoa exista
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // get para usar a informacao que será registrada dentro da variavel criada no objeto ou do objeto
    public String getNome() {
        return nome;
    }

    // set para poder salvar a informacao dentro da variavel criada no objeto ou do objeto
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
