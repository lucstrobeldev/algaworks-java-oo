package poo_v2.sobreposicao;

import java.util.Date;

public class ProdutoPerecivel extends Produto{

    protected Date dataValidade;

    public void identificar(){
        super.identificar(); // super serve para chamar o metodo que esta sendo utilizado na classe extendida Produto
        //isso se chama a sobreposicao
        System.out.println("Data de validade: " + dataValidade);
    }

}
