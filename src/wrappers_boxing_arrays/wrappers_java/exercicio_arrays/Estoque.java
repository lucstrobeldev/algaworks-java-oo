package wrappers_boxing_arrays.wrappers_java.exercicio_arrays;

public class Estoque {
    Produto[] produtos;

    void listarProdutos(){
        System.out.println("\nProdutos em estoque");
        System.out.println("-----------------------");

/*        for (int i = 0; i < produtos.length; i++) {
            produtos[i].desccrever();
        }*/

        for (Produto produto : produtos) {
            produto.desccrever();
        }
    }
}