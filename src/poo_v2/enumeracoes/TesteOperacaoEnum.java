package poo_v2.enumeracoes;

public class TesteOperacaoEnum {
    public static void main(String[] args) {
        OperacaoAritmetica o1 = OperacaoAritmetica.ADICAO;

        int resultado1 = o1.operacao(5, 3);
        System.out.println("O restultado é: " + resultado1);

        // este é o chamado for avançado
        //basicamente funciona da seguinte maneira:
        //   for (<TIPO_DO ATRIBUTO><NOME DO ATRIBUTO> : <NOME_DA_COLLECTION>)
        //ou for (String variavel : collection)
        for (OperacaoAritmetica oa : OperacaoAritmetica.values()){
            System.out.println(oa + " -> " + oa.operacao(4, 2));
        }
    }

}
