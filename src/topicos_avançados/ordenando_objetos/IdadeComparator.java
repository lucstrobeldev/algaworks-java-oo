package topicos_avançados.ordenando_objetos;

import java.util.Comparator;

public class IdadeComparator implements Comparator<Pessoa> {

    //Java Comparator
    //O objeto Comparator é usado para comparar dois objetos diferentes na mesma classe ou
    //em duas classes diferentes com a ajuda da implementação da interface java.lang.Comparator
    //Usamos Comparator quando existe mais de uma maneira de comparar os dois objetos.
    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        if (p1.getIdade() < p2.getIdade()){
            return -1;
        } else if (p1.getIdade() > p2.getIdade()){
            return 1;
        }
        return 0;
    }
}
