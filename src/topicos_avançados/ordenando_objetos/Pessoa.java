package topicos_avançados.ordenando_objetos;

public class Pessoa implements Comparable<Pessoa> {

    //O Comparable permite que uma determinada classe diga como uma instância dela deverá ser
    //comparada com outras instâncias dela mesma.
    //Por exemplo: Pessoa é comparada com outra pessoa de acordo com a sua altura.

    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return nome +
                " tem " + idade +
                " anos.";
    }


    @Override
    public int compareTo(Pessoa pessoa) {
        return this.nome.compareTo(pessoa.getNome());
    }
}
