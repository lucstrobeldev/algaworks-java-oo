package fundamentos_linguagem;

import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome");
        String nome = entrada.nextLine();

        System.out.println("Oi " + nome + ", digite o seu peso em um valor inteiro");
        int peso = entrada.nextInt();

        System.out.println(nome + ", digite sua altura");
        double altura = entrada.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println(nome + ", seu IMC é: " + imc);

        //Estrutura de controle if, else if e else

        if(imc < 18.5){
            System.out.println("Abaixo do peso normal");
        } else if (imc >= 18.5 && imc <= 24.9){
            System.out.println("Peso normal");
        } else if (imc >= 25 && imc <=29.9){
            System.out.println("Excesso de peso");
        } else if (imc >= 30 && imc <= 34.9){
            System.out.println("Obesidade classe I");
        } else if (imc >= 35 && imc <= 39.9){
            System.out.println("Obesidade classe II");
        } else {
            System.out.println("Obesidade classe III");
        }
    }
}
