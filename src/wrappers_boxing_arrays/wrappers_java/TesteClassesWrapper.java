package wrappers_boxing_arrays.wrappers_java;

public class TesteClassesWrapper {
    public static void main(String[] args) {
        // tipos primitivos que vimos:
        // byte, short, int, long, float, double e char
        // e os wrapper desses tipos sao:
        // Byte, Short, Integer, Long, Float, Double e Charracter

        int x = 5;
        //wrapper é basicamente envelopar um tipo dentro de uma classe:
        int i = 5;

        // wrapper é a transformacao de um Tipo em Classe, para que tenhamos acesso a diversos atributos da classe
        // como por exemplo a conversao de um valor inteiro para byte
        byte y = (byte) i;

        //precisamos converter um valor string para um valor inte, exemplifiquemos:
        String valor = "15.5";
        float v = Float.parseFloat(valor);
        System.out.println(v + 3);

        //outro exemplo
        int idade = Integer.parseInt("27");
        System.out.println("Daqui a 5 anos voce terá: " + (idade + 5) + " anos.");

        //exemplo no qual a conversao nao funciona
        try {
            double custo = Double.parseDouble("Vinte e tres reais e cinquenta centavos");
            System.out.println("Custo total: " + custo);
        } catch (NumberFormatException e){
            System.err.println("Numero invalido para conversao.");
        }


    }
}
