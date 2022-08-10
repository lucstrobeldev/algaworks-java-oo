package fundamentos_linguagem;

import java.util.Scanner;

public class DescobreAnoBissexto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ano: ");

        int ano = entrada.nextInt();

        if(ano % 400 == 0){ // Todos os multiplos de 400 sao bissexto
            System.out.println("O ano  \"" + ano + "\" eh um ano bissexto");
        } else if (ano % 4 == 0){
            if (ano % 100 != 0){ // multiplo de 4 e nao multiplo de 100 sao bissextos
                System.out.println("O ano \"" + ano + "\" eh um ano bissexto");
            } else {
                System.out.println("O ano \"" + ano + "\" nao eh um ano bissexto");
            }
        } else {
            System.out.println("O ano \"" + ano + "\" nao eh um ano bissexto");
        }
    }
}
