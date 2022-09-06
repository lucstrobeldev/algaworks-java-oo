package poo_v2.desafio.herança_sobreposicao;

public class Conta {

    private String descricao;
    private Double valor;
    private String dataVencimento;
    protected SituacaoConta situacaoConta;

    public Conta(){
        this.situacaoConta = SituacaoConta.PENDENTE;
    }

    public void cancelar(){
        if (SituacaoConta.PAGA.equals(this.getSituacaoConta())){
            System.out.println("Nao pode cancelar uma conta que já foi paga: "
            + this.getDescricao());
        } else if(SituacaoConta.CANCELADA.equals(this.getSituacaoConta())){
            System.out.println("Nao pode cancelar uma conta que ja foi cancelada: "
            + this.getDescricao());
        } else {
            System.out.println("Cancelando conta " + this.getDescricao());

            // altera a situacao da conta para CANCELADA
            this.situacaoConta = SituacaoConta.CANCELADA;
        }
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public SituacaoConta getSituacaoConta() {
        return situacaoConta;
    }
}
