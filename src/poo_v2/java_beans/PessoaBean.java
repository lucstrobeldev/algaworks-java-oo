package poo_v2.java_beans;


public class PessoaBean {

    private String nome;

    private int iddade;

    public PessoaBean() {
    }

    //o metodo get é para poder pegar o que esta dentro da variavel
    public String getNome() {
        return nome;
    }

    //o metodo set é para poder alterar o que esta dentro da variavel
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIddade() {
        return iddade;
    }

    public void setIddade(int iddade) {
        this.iddade = iddade;
    }
}
