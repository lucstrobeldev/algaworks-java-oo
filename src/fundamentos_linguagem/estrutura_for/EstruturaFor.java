package fundamentos_linguagem.estrutura_for;

import java.util.Scanner;

public class EstruturaFor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ultimo numero: ");
        int numeroFinal = entrada.nextInt();
        // for precisa sempre ter uma iniciacao, uma condicao e um incremento, portanto:
        for (int i = 1; i <= numeroFinal; i++){
            System.out.println(i);
        }
    }
}
