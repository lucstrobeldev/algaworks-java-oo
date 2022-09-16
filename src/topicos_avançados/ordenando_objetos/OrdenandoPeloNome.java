package topicos_avançados.ordenando_objetos;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OrdenandoPeloNome {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Joao", 22);
        Pessoa p2 = new Pessoa("Maria", 21);
        Pessoa p3 = new Pessoa("Pedro", 24);
        Pessoa p4 = new Pessoa("Adriana", 23);

        //metodo Arrays adiciona automaticamente os objetos para dentro da lista

        List<Pessoa> pessoas = Arrays.asList(p1, p2, p3, p4);
        Collections.sort(pessoas);

        for (Pessoa pessoa :
                pessoas) {
            System.out.println(pessoa);
        }
    }
}
