package topicos_avançados.collections_frameworks.hashset;

import topicos_avançados.collections_frameworks.Aluno;

import java.util.HashSet;
import java.util.Set;

public class TesteSetHashSet {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Joao");
        Aluno a2 = new Aluno("Maria");
        Aluno a3 = new Aluno("Jose");
        Aluno a4 = new Aluno("Pedro");

        //diferente do array list, no qual aceitamos objetos repetidos
        //o hashset nao aceita, nao permite repetir objetos
        //a ordenacao tambem é feita aleatoria
        Set<Aluno> alunos = new HashSet<Aluno>();

        alunos.add(a1);
        alunos.add(a2);
        alunos.add(a4);
        alunos.add(a4);

        imprimirAlunos(alunos);
    }

    private static void imprimirAlunos(Set<Aluno> alunos) {
        for (Aluno a :
                alunos) {
            System.out.println("Nome do aluno: " + a.getNome());
        }
    }
}
