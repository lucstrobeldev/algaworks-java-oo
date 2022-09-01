package poo_v2.java_beans;

public class TesteJavaBean {
    public static void main(String[] args) {
        PessoaBean pessoaBean = new PessoaBean();
        pessoaBean.setNome("Maria");
        pessoaBean.setIddade(27);

        System.out.println(pessoaBean.getNome() + " tem " + pessoaBean.getIddade() + " anos.");
    }
}
