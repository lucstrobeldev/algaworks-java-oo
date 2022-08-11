package fundamentos_linguagem.trabalhando_com_strings;

public class TrabalhandoComStrings {
    public static void main(String[] args) {

        int x = 10;
        int y = 5;
        int z = x + y;


        System.out.println("Oi meu amigo Leonardo!");
        System.out.println("O Resultado é:" + z);
        System.out.println("Resultado: " + x + y); //isso acontece pq a ordem de execucao do código é sempre da esquerda para a direita
        System.out.println( x + y + " é o resultado.");//como a ordem de exec é da esquerda para a direita ele entendeu que ha uma soma e depois uma stirng
        System.out.println("O Resultado é: " + (x + y));//aqui como colocamos a soma em evidencia, a leitura entende que é para executar o que esta dentro dos parenteses


        String nome = "Maria";
        int idade = 30;

        System.out.println(nome + " tem " + idade + "anos");//concatenaçao de tipos de variaveis

    }
}
