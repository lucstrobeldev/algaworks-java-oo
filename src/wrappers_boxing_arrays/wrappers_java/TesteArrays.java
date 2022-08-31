package wrappers_boxing_arrays.wrappers_java;

public class TesteArrays {
    public static void main(String[] args) {
        /*
        Um array é uma estrutura de dados usada para armazenar dados do mesmo tipo.
        Os arrays armazenam seus elementos em localizações sequenciais contínuas da memória.
        Em Java, arrays são objetos.
        Todos os métodos da classe Object podem ser invocados em um array.
        */


        int[] notas = new int[5]; // (a variavel notas tambem é um objeto todos os arrays sao tambem um objeto)
        notas[0] = 10;
        notas[1] = 5;
        notas[2] = 8;
        notas[3] = 9;
        notas[4] = 7;

        System.out.println("Nota do primeiro aluno: " + notas[0]);

        System.out.println("Tamanho do array " + notas.length);

        for (int i = 0; i < notas.length; i++){
            System.out.println("Posicao [" + i + "]=" + notas[i]);
        }

    }
}
