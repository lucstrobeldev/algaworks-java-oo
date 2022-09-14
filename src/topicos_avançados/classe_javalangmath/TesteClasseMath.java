package topicos_avançados.classe_javalangmath;

public class TesteClasseMath {

    static final double PI = 3.1415;

    public static void main(String[] args) {
        // Comprimento de uma circunferencia 2 x r x PI
        int raio = 4;
        double comprimento = 2 * raio * PI;
        // ou podemos utilizar a lib da classe math:
        // double comprimento = 2 * raio * Math.PI;
        System.out.println("Comprimento: " + comprimento);

        // Maximo e Minimo
        double[] precosProdutoA = {30.20, 25.49};
        System.out.println("Maior preço: " + Math.max(precosProdutoA[0], precosProdutoA[1]));

        //Potencia
        System.out.println("2 elevado a 3: " + Math.pow(2, 3));

        // Raiz Quadrada
        System.out.println(" Raiz quadradada de 9: " + Math.sqrt(9));

        //Arredondamento ceil, floor e round
        double n = 5.68;
        System.out.println("Menor inteiro : " + Math.floor(n));
        System.out.println("Maior inteiro: "+ Math.ceil(n));
        System.out.println("Arredondamento: " + Math.round(n));

        //Trigonometria
        System.out.println("Seno: " + Math.sin(40));

        // Numeros randomicos
        // para que o cast desse certo nessa situacao, precisamos lembrar que a leitura do código
        // é feita da esquerda para a direita, por tanto se nao colocassemos o Math.random * 100 dentro
        // de um parenteses, o que iria acontecer é o cast seria feito somente para o metodo random
        // e como o metodo random é 0 a < 1, portanto nunca chega a 1, seria sempre arredondado para 0
        // e 0 * 100 == 0.
        double numeroAleatorio = (int) (Math.random() * 100);
        System.out.println(numeroAleatorio);

    }
}
