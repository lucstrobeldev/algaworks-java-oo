package poo_v2.modificadores_static_e_final.modificador_static;

public class TesteContador {
    public static void main(String[] args) {

        Contador c = new Contador();
        c.incrementar();
        System.out.println(Contador.COUNT);

        Contador.COUNT++;
        System.out.println(Contador.COUNT);

        Contador.imprimirContador();


/*        Contador.count++;

        int valorDoCount = Contador.count;

        System.out.println("valor: " + valorDoCount);*/
    }
}
