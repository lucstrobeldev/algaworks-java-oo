package topicos_avançados.desafios.mega_sena;

import java.util.Scanner;

public class SorteioMegaSena {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantos jogos? ");
        int quantidadeJogos = entrada.nextInt();

        System.out.println("--------------------------");

        for (int i = 1; i <= quantidadeJogos; i++){
            MegaSena megaSena = new MegaSena();
            megaSena.sortear();
            megaSena.exibirNumeros();
            System.out.println("--------------------------");

        }

        System.out.println("*** Boa Sorte! ***");


    }
}
