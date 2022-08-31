package wrappers_boxing_arrays.wrappers_java.exercicio_arrays;

import java.util.Scanner;

public class Gerenciamento {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // obtém a quantidade de produtos que o usuário deseja informar
        System.out.println("Quantos produtos?");
        int quantidadeProdutos = entrada.nextInt();

        // Precisamos dessa linha extra para garantir que uma nova linha seja lida,
        //pois nextInt nao le uma nova linha, mas apenas um numero
        //fica feio, mas tente nao coloca-la para ver o que acontece
        entrada.nextLine();

        // instancia um objeto da classe Estoque
        Estoque estoque = new Estoque();

        // instancia um array de produtos com a quantidade de posicoes que o usuario informou
        estoque.produtos = new Produto[quantidadeProdutos];

        // percorre todas as posicoes no array (que estao nulas)
        // e preenche uma por uma com a entrada do teclado do usuário
        for (int i = 0; i < estoque.produtos.length; i++){
            estoque.produtos[i] = new Produto();

            System.out.println("\nProduto " + i);
            System.out.println("------------------");

            System.out.println("Descricao: " + i);
            estoque.produtos[i].descricao = entrada.nextLine();

            System.out.println("Quantidade de itens: ");
            estoque.produtos[i].quantidade = entrada.nextInt();
            entrada.nextLine();
        }

        estoque.listarProdutos();
    }
}
