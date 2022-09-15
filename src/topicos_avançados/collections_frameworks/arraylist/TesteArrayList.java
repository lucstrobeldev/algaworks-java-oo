package topicos_avançados.collections_frameworks.arraylist;

import topicos_avançados.collections_frameworks.Aluno;

import java.util.ArrayList;
import java.util.List;

public class TesteArrayList {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Joao");
        Aluno a2 = new Aluno("Maria");
        Aluno a3 = new Aluno("Jose");
        Aluno a4 = new Aluno("Pedro");

        List<Aluno> alunos = new ArrayList<Aluno>();

        alunos.add(a1);
        alunos.add(a2);
        alunos.add(a3);
        alunos.add(a4);

        imprimirAlunos(alunos);

    }

    private static void imprimirAlunos(List<Aluno> alunos) {
        //pega elemento por elemento da lista alunos e coloca dentro da variavel a do tipo Aluno
        for (Aluno a : alunos) {
            System.out.println("Nome do aluno: " + a.getNome());
        }
    }


}
