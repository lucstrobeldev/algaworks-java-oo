package poo_programacao_orientada_objetos.classes_objetos.criando_classe_com_objetos;

public class Principal {
    public static void main(String[] args) {
        // iremos criar um objeto do tipo carro

        Carro meuCarro; //declaramos a variavel
        meuCarro = new Carro(); //instanciamos a variavel com um objeto do tipo Carro
        Carro seuCarro = new Carro(); // essa é outra maneira de declarar e ao mesmo tempo instanciar a variavel


        // Atribuimos valores as variaveis
        meuCarro.modelo = "Palio";
        meuCarro.anoDeFabricacao = 2011;
        meuCarro.cor = "Prata";
        meuCarro.fabricante = "Fiat";

        seuCarro.modelo = "Civic";
        seuCarro.anoDeFabricacao = 2009;
        seuCarro.cor = "Preto";
        seuCarro.fabricante = "Honda";
        // Aqui lemos os atributos do objeto meuCarro
        System.out.println("Meu carro");
        System.out.println("--------------------");
        System.out.println("Modelo: " + meuCarro.modelo);
        System.out.println("Ano: " + meuCarro.anoDeFabricacao);
        System.out.println("Cor: " + meuCarro.cor);
        System.out.println("Fabricante: " + meuCarro.fabricante);

        System.out.println();
        System.out.println("Seu Carro");
        System.out.println("--------------------");
        System.out.println("Modelo: " + seuCarro.modelo);
        System.out.println("Ano: " + seuCarro.anoDeFabricacao);
        System.out.println("Cor: " + seuCarro.cor);
        System.out.println("Fabricante: " + seuCarro.fabricante);


    }
}
