package poo_v2.modificadores_static_e_final.desafio;

public class MatematicaUtil {

    final static float PI = 3.14f;

    // http://pt.wikipedia.org/wiki/Número_de_Fibonacci
    public static int calcularFibonacci(int posicao){
        if (posicao < 2){
            return posicao;
        }
        return calcularFibonacci(posicao - 1) + calcularFibonacci(posicao - 2);
    }

    public static double calcularAreaCirculo(double raioArea){
        final double calculoAreaDoRaio = (raioArea * raioArea) * PI;

        return calculoAreaDoRaio;
    }

    public static double calcularAreaCilindro(double raioArea, double altura){
        final double calculoAreaDoRaio = (raioArea * raioArea) * PI;
        return calculoAreaDoRaio * altura;
    }

}
