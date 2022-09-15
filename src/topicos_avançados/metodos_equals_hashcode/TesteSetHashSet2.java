package topicos_avançados.metodos_equals_hashcode;

import java.util.Set;

public class TesteSetHashSet2 {
    public static void main(String[] args) {
        Set<Aluno> alunos = SimuladorBancoDeDados.buscarAlunos();

        //De alguma forma, sorteia o nome do aluno e constroi o objeto Aluno
        Aluno alunoSorteado = new Aluno("Maria");

        if (alunos.contains(alunoSorteado)){
            System.out.println("Aluno sorteado: " + alunoSorteado.getNome() + ", Parabéns! Voce ganhou um brinde");
        } else {
            System.out.println("Aluno inexistente.");
        }
    }
}
