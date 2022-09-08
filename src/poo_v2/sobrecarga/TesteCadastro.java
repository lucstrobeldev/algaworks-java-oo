package poo_v2.sobrecarga;

public class TesteCadastro {
    public static void main(String[] args) {
        CadastroPessoa cadastroPessoa = new CadastroPessoa();

        Pessoa pessoa = new Pessoa("José", 32);
        cadastroPessoa.cadastrar(pessoa);

        //-----------------------------------------------------

        cadastroPessoa.cadastrar("Maria", 24);

        //----------------------------------------------------

        cadastroPessoa.cadastrar("Lucas");

    }
}
