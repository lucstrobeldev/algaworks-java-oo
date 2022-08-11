package fundamentos_linguagem.incremento_decremento;

public class IncrementoDecremento {
    public static void main(String[] args) {
        int idade = 10;

        int novaIdade = idade++;  // é necessario lembrar que a ordem de execucao é sempre da esquerda para a direita portanto ao executar
                                    // ele irá ler primeiro a variavel e somente depois irá fazer o incremento, portanto a ordem correta deve ser:
        int novaIdadeReal = ++idade;


        //Tambem podemos fazer da seguinte forma:
        //idade = idade + 1;
        // idade += 1;
        // idade ++; isso aqui é o mesmo que escrevermos o que esta descrito na linha 7

        System.out.println("Idade: " + idade);
        System.out.println(novaIdade);
        System.out.println(novaIdadeReal);

        // para decremento utilizamos a sintaxe --

        int idadeNova = --idade;

        System.out.println(idadeNova);

    }
}
