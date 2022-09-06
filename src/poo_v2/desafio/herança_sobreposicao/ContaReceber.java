package poo_v2.desafio.herança_sobreposicao;

public class ContaReceber extends Conta{

    private Cliente cliente;

    public ContaReceber(Cliente cliente, String descricao, Double valor, String dataVencimento) {
        this.cliente = cliente;
        this.setDescricao(descricao);
        this.setValor(valor);
        this.setDataVencimento(dataVencimento);

    }

    public ContaReceber() {

    }

    public void receber(){
        if (SituacaoConta.PAGA.equals(this.getSituacaoConta())){
            System.out.println("Nao pode receber uma conta que ja esta paga: "
            + this.getDescricao());
        } else if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())){
            System.out.println("Nao pode receber uma conta que está cancelada: "
            + getDescricao());
        } else {
            System.out.println("Recebendo conta " + this.getDescricao() + " no valor de "
            + this.getValor() + " e vencimento em " + this.getDataVencimento() +
                    " do cliente " + this.getCliente().getNome());
        }
    }

    public void cancelar(){
        if(this.getValor() > 5000d){
            System.out.println("Essa conta a receber nao pode ser cancelada. " +
                    "É muito dinheiro para deixar de receber: " + this.getDescricao());
        } else {
            super.cancelar();
        }
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
