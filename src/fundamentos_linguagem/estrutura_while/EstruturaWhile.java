package fundamentos_linguagem.estrutura_while;

import java.util.Scanner;

public class EstruturaWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o numero inicial: ");
        int numeroInicial = entrada.nextInt();

        System.out.println("Digite o numero final: ");
        int numeroFinal = entrada.nextInt();

        int numeroAtual = numeroInicial;

        // a condicao dentro do while precisa ser sempre uma expressao booleana, true ou false
        while (numeroAtual <= numeroFinal){
            System.out.println(numeroAtual);
            numeroAtual++;
        }
    }
}
