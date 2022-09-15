package topicos_avançados.collections_frameworks.hashmap;

import topicos_avançados.collections_frameworks.Aluno;

import java.util.HashMap;
import java.util.Map;

public class TesteMapHashMap {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Joao");
        Aluno a2 = new Aluno("Maria");
        Aluno a3 = new Aluno("Jose");
        Aluno a4 = new Aluno("Pedro");


        //assim como o array set, nao aceitamos objetos reptidos com a mesma chave ce acesso
        //porem o mesmo objeto pode ter 2 chaves de acesso como visto no exempli abaixo
        //como o objeto dentro do array existe uma chave indicando/identificando o mesmo
        //é possivel realizar ordenacao
        Map<String, Aluno> alunos = new HashMap<String, Aluno>();

        alunos.put("1", a1);
        alunos.put("2", a2);
        alunos.put("3", a3);
        alunos.put("4", a4);
        alunos.put("5", a4);

        imprimirAlunos(alunos);

        Aluno alunoRecuperado = alunos.get("3");
        System.out.println(alunoRecuperado.getNome());
    }

    private static void imprimirAlunos(Map<String, Aluno> alunos) {
        for (Aluno a :
                alunos.values()) {
            System.out.println("Nome: " + a.getNome());
        }
    }
}
