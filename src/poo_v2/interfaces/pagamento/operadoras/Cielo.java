package poo_v2.interfaces.pagamento.operadoras;

import poo_v2.interfaces.pagamento.Autorizavel;
import poo_v2.interfaces.pagamento.Cartao;
import poo_v2.interfaces.pagamento.Operadora;

public class Cielo implements Operadora {
    @Override
    public boolean autorizar(Autorizavel autorizavel, Cartao cartao) {
        return cartao.getNumeroCartao().startsWith("123")
                && autorizavel.getValorTotal() < 100;
    }
}
