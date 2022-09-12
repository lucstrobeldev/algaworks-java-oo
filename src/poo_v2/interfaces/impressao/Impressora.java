package poo_v2.interfaces.impressao;

// toda interface é uma classe 100% abstrata
public interface Impressora {

    //nao é comum tipar como public abstract, visto que por ser interface isso ja é automatico.
    public abstract void imprimir(Imprimivel imprimivel);

}
