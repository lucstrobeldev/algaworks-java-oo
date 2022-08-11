package fundamentos_linguagem.multa_veiculo;

import java.util.Scanner;

public class MultaVeiculo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Tipo do veiculo (passeio, caminhao)");
        String tipoVeiculo = entrada.nextLine();

        System.out.println("Velocidade maxima da via");
        int velocidadeMaxima = entrada.nextInt();

        System.out.println("Velocidade do veiculo");
        int velocidadeVeiculo = entrada.nextInt();
        double volcidadeLimitePermitidaPasseio = velocidadeVeiculo * 1.1;
        double volcidadeLimitePermitidaCaminhao = velocidadeVeiculo * 1.05;

        //veiculo de passeio com velocidade maior que 10% da velocidade deve ser multado
        //caminho com velocidade maior que 5% da velocidade deve ser multado

        if(tipoVeiculo.equals("passeio") && velocidadeVeiculo > velocidadeMaxima * 1.1 ){ //para fazermos a comparacao de uma variavel a uma string nos utilizamos equals
            System.out.println("Sua velocidade foi de: " + volcidadeLimitePermitidaPasseio + " portanto, multado");
        } else if (tipoVeiculo.equals("caminhao") && velocidadeVeiculo > velocidadeMaxima * 1.05 ){
            System.out.println("Sua velocidade foi de: " + volcidadeLimitePermitidaCaminhao + " portanto, multado");
        }
    }
}

