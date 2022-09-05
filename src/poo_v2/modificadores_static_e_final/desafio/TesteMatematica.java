package poo_v2.modificadores_static_e_final.desafio;

public class TesteMatematica {
    public static void main(String[] args) {
        int numeroFibonacci = MatematicaUtil.calcularFibonacci(8);
        System.out.println("Numero de Fibonacci da posicao 8: " + numeroFibonacci);

        double areaCirculo = MatematicaUtil.calcularAreaCirculo(104.8);
        System.out.println("Area do circulo: " + areaCirculo);

        double areCilindro = MatematicaUtil.calcularAreaCilindro(100, 2);
        System.out.println("Area do Cilindro: " + areCilindro);
    }
}
