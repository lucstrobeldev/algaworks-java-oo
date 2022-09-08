package poo_v2.polimorfismo;

public class TestePolimorfismo {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.setSaldo(4000);

        imprimirSaldo(conta);
        TestePolimorfismo.imprimirSaldo(conta); // esse exemplo faz a mesma coisa que o de cima
        //------------------------------------------------
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.setSaldo(3500);
        imprimirSaldo(contaCorrente);
        //------------------------------------------------
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.setSaldo(10000);
        imprimirSaldo(contaPoupanca);
    }

    public static void imprimirSaldo(Conta conta){
        System.out.println("Saldo da conta: R$" + conta.getSaldo());

        //O instanceof é um operador que permite instanciar um objeto em
        //uma instância de um tipo específico de uma class, subclass ou interface.
        if (conta instanceof ContaCorrente){
            ContaCorrente cc = (ContaCorrente) conta;
            System.out.println("O limite da cc é R$" + cc.getLimite());
        }

        //O cast é uma conversão, é quando convertemos um valor de um tipo para outro tipo.
        // ContaPoupanca cp = (ContaPoupanca) conta;
        if (conta instanceof ContaPoupanca){
            ContaPoupanca cp = (ContaPoupanca) conta;
            System.out.println("O rendimento da cp é R$" + cp.getRendimentos());
        }
    }


}
