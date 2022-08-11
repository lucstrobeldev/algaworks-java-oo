package fundamentos_linguagem.operador_ternario;

import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = entrada.nextInt();

        String indicacao = (idade >= 18) ? "adulto" : "crianca/adolescente" ; // Aqui utilizamos o poperador ternario.

        // O operador ternário é uma alternativa para substituir o if…else em algumas situações por ser um comando bem enxuto.
        // Condição é a condição que será testada.
        // Verdadeiro é o que fazer quando a condição for verdadeira.
        // Falso é o que fazer quando a condição for falsa.
        // Utilizamos ele para substituir o if else abaixo:
/*
        if (idade >= 18) {
            indicacao = "adulto";
        } else {
            indicacao = "crianca/adolescente";
        }
*/
        System.out.println("Resultado: " + indicacao);
    }
}
