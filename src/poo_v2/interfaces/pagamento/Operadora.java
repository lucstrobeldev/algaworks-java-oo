package poo_v2.interfaces.pagamento;

public interface Operadora {

    boolean autorizar(Autorizavel autorizavel, Cartao cartao);

}
