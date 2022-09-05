package poo_v2.modificadores_static_e_final.modificador_static;

public class Contador {

    public static int COUNT;
    public final static double PI = 3.14;

    //o modificador final deixa a variavel constante, ou seja, nao pode ser alterado
    //A palavra reservada static serve: na declaração de uma variável dentro de uma classe, para
    // se criar uma variável que será compartilhada por todas as instâncias
    // de objetos de uma classe como um variável comum.

    public void incrementar(){
        COUNT++;
    }

    //os modificador static tambem pode sre utilizado para um metodo:
    public static void imprimirContador() {
        System.out.println("O valor do contador agora é: " + Contador.COUNT);
    }


}
