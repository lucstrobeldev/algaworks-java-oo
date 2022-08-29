package wrappers_boxing_arrays.wrappers_java;

import java.util.Objects;

public class Televisor {
    // Desafio Wrapper & Boxing

    Integer canal = 130;
    Integer volume = 20;

    void mudarCanal(Integer novoCanal) {
        if (Objects.equals(canal, novoCanal)) {
            System.out.println("Novo canal é também o canal atual.");
        } else {
            canal = novoCanal;
            System.out.println("Canal alterado para " + canal);
        }
    }

    void mudarVolume(Integer novoVolume){
        if (Objects.equals(novoVolume, volume)) {
            System.out.println("Novo volume é também o volume atual.");
        } else {
            volume = novoVolume;
            System.out.println("Volume alterado para " + volume);
        }
    }

    public static void main(String[] args) {
        Televisor tv = new Televisor();

        //Nao deveria mudar o volume e canal
        tv.mudarVolume(20);
        tv.mudarCanal(130);

        //Deveria mudar o volume e canal
        tv.mudarVolume(300);
        tv.mudarCanal(10);
    }

}
