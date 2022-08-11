package fundamentos_linguagem.exemplo_break;

import java.util.Scanner;

public class ExemploContinue {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int divisor = entrada.nextInt();

        for (int i = 100; i <= 120; i++){
            if (i % divisor == 0){
                continue; //continue ele nao encerra o laço, apenas nao imprime a condicao dentro do laço
            }
            System.out.println(i);
        }
        System.out.println("Fim do Programa.");
    }
}
