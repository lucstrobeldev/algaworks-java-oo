package topicos_avançados.numeros;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;

public class TesteNumeros {
    public static void main(String[] args) {
        DecimalFormat format = new DecimalFormat("R$ #,##0.00");
        double valorProduto = 13.59;

        System.out.println(valorProduto);
        // o padrao brasileiro é a virgula e nao ponto, vamos trabalhar isso agora:
        // definimos o padrao na linha 7
        valorProduto = 1300.59;
        System.out.println(format.format(valorProduto));

        String entrada = "R$ 54,34";
        try {
            double numero = format.parse(entrada).doubleValue();
            System.out.println("Numero: " + numero);
        } catch (ParseException e) {
            System.out.println("Entrada inválida");
        }

        BigDecimal bg = new BigDecimal(5000);
        //essa classe nao tem algumas limitacoes que os tipos primitivos, podendo trabalhar com numeros bem grandes

    }
}
