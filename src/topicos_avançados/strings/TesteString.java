package topicos_avançados.strings;

public class TesteString {

    public static void main(String[] args) {
        //String, StringBuilder e StringBuffer
        //String é imutavel, é um valor que nao muda nunca

        String s = "Olá Mundo!"; //criado a string ola mundo
        s += " Divertido!"; //criado a string ola mundo divertido
        //portanto temos aqui duas strings, tendo assim em uma visao macro problemas de performances

        System.out.println(s);

        // e pra isso o java tem algumas solucoes
        //sao eles o StringBuilder e o StringBuffer
        //StringBuilder::

        StringBuilder sb = new StringBuilder("Ola mundo!");// criado a stringbuilder
        sb.append(" Divertido!");//aqui a gente reaproveitar a mesma stringbuilder criada na linha anterior e contatenando ambos

        System.out.println(sb);

        //StringBuffer:
        // é utilizado para compartilhamento de variaveis para que nao haja erro de concatenacoes em threads multiplas




    }
}
