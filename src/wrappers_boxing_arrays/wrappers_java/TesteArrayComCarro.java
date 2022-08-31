package wrappers_boxing_arrays.wrappers_java;

import poo_programacao_orientada_objetos.classes_objetos.criando_classe_com_objetos.Carro;

public class TesteArrayComCarro {
    public static void main(String[] args) {
        Carro[] carros = new Carro[4];

        carros[0] = new Carro();
        carros[0].anoDeFabricacao = 2011;

        System.out.println("O ano de fabricacao é: " + carros[0].anoDeFabricacao);
    }
}
