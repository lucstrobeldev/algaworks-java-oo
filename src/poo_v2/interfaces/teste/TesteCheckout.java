package poo_v2.interfaces.teste;

import poo_v2.interfaces.caixa.Checkout;
import poo_v2.interfaces.caixa.Compra;
import poo_v2.interfaces.impressao.Impressora;
import poo_v2.interfaces.impressao.impressoras.ImpressoraEpson;
import poo_v2.interfaces.pagamento.Cartao;
import poo_v2.interfaces.pagamento.Operadora;
import poo_v2.interfaces.pagamento.operadoras.Cielo;

public class TesteCheckout {

    public static void main(String[] args) {
        Operadora operadora = new Cielo();
        Impressora impressora = new ImpressoraEpson();

        Cartao cartao = new Cartao();
        cartao.setNomeTitular("Joao M Couves");
        cartao.setNumeroCartao("123");

        Compra compra = new Compra();
        compra.setNomeCliente("Joao Mendes Couves");
        compra.setProduto("Sabonetes");
        compra.getValorTotal();

        Checkout checkout = new Checkout(operadora, impressora);
        checkout.fecharCompra(compra, cartao);
    }
}
