package poo_v2.objeto_this;

import poo_programacao_orientada_objetos.classes_objetos.criando_classe_com_objetos.Carro;

public class ExemploThis {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.modelo = "Palio";

        System.out.println("Modelo antes: " + carro.modelo);
        // O this é usado para referenciar a um atributo externo fora do metodo.
        // Por exemplo ser dentro de um método se estiver dois atributos com o mesmo nome
        // oque estiver com a palavra "this" estará
        // se referenciando a um atributo fora do metodo.
        carro.alterarModelo("Civic");

        System.out.println("Modelo depois: " + carro.modelo);
    }

}
