package topicos_avançados.coleta_de_lixo;

import poo_programacao_orientada_objetos.classes_objetos.criando_classe_com_objetos.Carro;

public class Principal2 {


    // Java garbage collection is the process by which java programs perform automatic memory management
    // Java programs compile to bytecode that can be run on a Java Virtual Machine (JVM), when Java programs
    // run on the JVM, objects are created on the heap, which is a portion of memory dedicated to the program
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.anoDeFabricacao = 2000;


        System.out.println(carro.anoDeFabricacao);


        // carro = null;

        System.out.println(carro.anoDeFabricacao);

    }

}
