package datails_frameworks.stringbuffer_builder;

public class ExemploStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        //o stringbuilder ele nao é  thread-safe, usado para o contexto que nao tem concorrencia em cima da variavel
        //e portanto é mais rapido o processamento
        //é uma classe string, a diferença é que essa classe ela é mutavel, ou seja, vc consegue alterar o valor
        //dentro da string

        sb.append("Bem vindo ao curso de Java ");
        sb.append("Fique a vontade para tirar suas dúvidas ");
        sb.append("Estamos aqui para te ajudar ");

        System.out.println(sb);

        sb.insert(26, " da Algaworks");
        System.out.println(sb);
    }
}
