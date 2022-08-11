package fundamentos_linguagem.escopo;

import java.util.Scanner;

public class Escopo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        int idade = entrada.nextInt();
        String nomePai = ""; // a declaracao de todas as variaveis a serem utilizadas no metodo precisam estar DENTRO do escopo do METODO

        boolean podeDirigir = idade >= 18;

        if (!podeDirigir){
            System.out.println("Digite o nome do seu Pai: ");

            nomePai = entrada.next();
        }

        System.out.println("Voce pode dirigir?");
        if (podeDirigir){
            System.out.println("Sim, claro!");
        } else {

            System.out.println("Nao, se fizer isso, seu pai " + nomePai + " será preso");
        }
    }
}
