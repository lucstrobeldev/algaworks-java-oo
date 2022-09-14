package topicos_avançados.desafios.numeros;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Numeros {
    // Desenvolva um programa que:
    // 1 - Recebe como parametro do usuario o valor de um produto do tipo double
    // 2 - Instancia um objeto do tipo BigDecimal atribuindo o valor double a ele
    // 3 - Calcula 10% do valor usando os métodos disponiveis na classe BigDecimal
    // 4 - Formata o novo valor calculado para o padrao monetario (R$)
    // 5 - Exibe na tela o valor calculado e formatado.
    public static void main(String[] args) {

        // 1 - Recebe como parametro do usuario o valor de um produto do tipo double
        Scanner entrada = new Scanner(System.in);
        System.out.println("Valor do produto: ");
        double valor = entrada.nextDouble();

        // 2 - Instancia um objeto do tipo BigDecimal atribuindo o valor double a ele
        BigDecimal valorBig = new BigDecimal(valor);
        // 3 - Calcula 10% do valor usando os métodos disponiveis na classe BigDecimal
        BigDecimal resultado = valorBig.multiply(BigDecimal.valueOf(0.1));

        // 4 - Formata o novo valor calculado para o padrao monetario (R$)
        DecimalFormat formatador = new DecimalFormat("R$ #,##0.00");
        String valorFormatado = formatador.format(resultado.doubleValue());
        // 5 - Exibe na tela o valor calculado e formatado.
        System.out.println("10% do valor é: " + valorFormatado);


    }
}
