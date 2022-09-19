package datails_frameworks.string_methods.exemplos_string;

public class ExemplosClasseString2 {

    public static void main(String[] args) {
        String s = "ALGAWORKS";

        System.out.println(s.charAt(0));
        System.out.println(s.charAt(2));
        System.out.println(s.charAt(8));


        // nao vai printar a linha de baixo pq nao tem nenhum caracter na posicao 9
        System.out.println(s.charAt(9));

    }
}
