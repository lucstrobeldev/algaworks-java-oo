package poo_v2.encapsulamento_modificadores_publico_private;

public class ArCondicionado {

    //quando tornamos o atributo temperatura private, esse atributo
    // só pode ser chamado dentro dessa classe que estamos
    private int temperatura;


    //quando tornamos um metodo publico, esse metodo
    //pode ser chamado em qualquer parte do sistema
    public void trocarTemperadura(int temperatura){
        if (temperatura >= 17 && temperatura <= 25){
            this.temperatura = temperatura;
        }
    }

    public int obterTemperatura(){
        return temperatura;
    }
}
