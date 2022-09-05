package poo_v2.modificador_de_acesso_default.Treinador;

import poo_programacao_orientada_objetos.classes_objetos.exercicio_atributos_objetos.Cachorro;

public class TreinadorCachorro {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.setNome("Bob");

        DonoCachorro dono = new DonoCachorro();
        dono.ensinarCachorroSentar(cachorro);
    }
}
