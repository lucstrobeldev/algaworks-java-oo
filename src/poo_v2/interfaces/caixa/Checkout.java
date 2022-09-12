package poo_v2.interfaces.caixa;

import poo_v2.interfaces.impressao.Impressora;
import poo_v2.interfaces.pagamento.Cartao;
import poo_v2.interfaces.pagamento.Operadora;

public class Checkout {

    private Operadora operadora;
    private Impressora impressora;

    public Checkout(Operadora operadora, Impressora impressora) {
        this.operadora = operadora;
        this.impressora = impressora;
    }

    public void fecharCompra(Compra compra, Cartao cartao){
        boolean autorizado = this.operadora.autorizar(compra, cartao);

        if (autorizado){
            this.impressora.imprimir(compra);
        } else {
            System.out.println("Pagamento nao autorizado!");
        }
    }

}
