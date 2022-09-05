package poo_programacao_orientada_objetos.classes_objetos.exercicio_atributos_objetos;

public class Cachorro {

    String nome;
    String raca;
    char sexo;
    int idade;

    public void sentar(){
        System.out.println("Eu, " + nome + " vou sentar.");
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
