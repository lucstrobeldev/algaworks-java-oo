package poo_programacao_orientada_objetos.classes_objetos.criando_classe_com_objetos;

public class Principal02 {
    public static void main(String[] args) {
        Proprietario proprietario = new Proprietario();
        proprietario.nome = "Joao da Silva";
        proprietario.cpf = "000.000.000-00";
        proprietario.idade = 25;
        proprietario.logradouro = "Rua Joao Pinheiro, 10";
        proprietario.bairro = "Centro";
        proprietario.cidade = "Uberlandia";

        Carro meuCarro = new Carro();
        meuCarro.modelo = "Palio";
        meuCarro.anoDeFabricacao = 2011;
        meuCarro.cor = "Prata";
        meuCarro.fabricante = "Fiat";
        meuCarro.dono = proprietario;

        Carro seuCarro = new Carro();
        seuCarro.modelo = "Civic";


        System.out.println("Proprietario: " + proprietario.nome);

        //Criando, nomeando e chamando métodos
        meuCarro.ligar();
        seuCarro.ligar();

    }
}
