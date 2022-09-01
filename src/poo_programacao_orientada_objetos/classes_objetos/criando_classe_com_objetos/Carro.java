package poo_programacao_orientada_objetos.classes_objetos.criando_classe_com_objetos;

import java.util.Objects;

public class Carro {
    // declaracao dos atributos do carro

    String fabricante;
    public String modelo;
    String cor;
    public int anoDeFabricacao;
    //criamos a classe carro com as propriedades e seus tipos
    //porém essas variaveis só existirao se houver um objeto

    Proprietario dono;

    public void alterarModelo(String modelo){
        if(Objects.nonNull(modelo)){
            this.modelo = modelo;
        }
    }

    //criando, nomeando e chamando métodos
    void ligar(){
        //escopo do método
        if (modelo != null){
            System.out.println("Ligando o carro: " + modelo);
        }
    }
    //como nós temos o tipo do método como void, significa que ele nao retorna nada
}
