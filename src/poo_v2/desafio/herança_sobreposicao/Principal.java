package poo_v2.desafio.herança_sobreposicao;

public class Principal {
    public static void main(String[] args) {
        //instanciando os fornecedores
        Fornecedor imobiliaria = new Fornecedor();
        imobiliaria.setNome("Casa & Cia Negocios Imobiliarios");
        Fornecedor mercado = new Fornecedor();
        mercado.setNome("Mercado Modelo");

        //instanciando clientes
        Cliente atacadista = new Cliente();
        atacadista.setNome("Triangulo Quadrado Atacadista");
        Cliente telecom = new Cliente();
        telecom.setNome("FoneNet Telecomunicacoes");

        //instanciando contas a pagar
        ContaPagar contaPagar1 = new ContaPagar();
        contaPagar1.setDescricao("Aluguel da matriz");
        contaPagar1.setValor(1230d);
        contaPagar1.setDataVencimento("12/09/2022");
        contaPagar1.setFornecedor(imobiliaria);

        ContaPagar contaPagar2 = new ContaPagar(mercado, "Compras do mes", 390d, "19/09/2022");

        //instanciando contas a receber
        ContaReceber contaReceber1 = new ContaReceber();
        contaReceber1.setDescricao("Desenvolvimento de projeto de logistica em Java");
        contaReceber1.setValor(89500d);
        contaReceber1.setDataVencimento("23/09/2022");
        contaReceber1.setCliente(atacadista);

        ContaReceber contaReceber2 = new ContaReceber(telecom, "Manutencao em sistema de conta online",
                53200d, "13/09/2022");

        //pagamento e cancelamento de contas a pagar
        contaPagar1.pagar();
        contaPagar2.cancelar();

        //recebimento e cancelamento de contas a receber
        contaReceber1.cancelar();
        contaReceber2.receber();
    }
}
