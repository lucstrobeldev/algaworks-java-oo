package poo_v2.interfaces.impressao.impressoras;

import poo_v2.interfaces.impressao.Impressora;
import poo_v2.interfaces.impressao.Imprimivel;

public class ImpressoraEpson implements Impressora {
    @Override
    public void imprimir(Imprimivel imprimivel) {
        System.out.println("*******************************************");
        System.out.println(imprimivel.getCabecalhoPagina());
        System.out.println("*******************************************");
        System.out.println(imprimivel.getCorpoPagina());
        System.out.println();
        System.out.println("-------------------------------------------");
        System.out.println("==                EPSON                    ");
        System.out.println("-------------------------------------------");

    }
}
