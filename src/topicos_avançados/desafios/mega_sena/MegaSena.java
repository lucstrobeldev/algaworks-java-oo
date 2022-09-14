package topicos_avançados.desafios.mega_sena;

public class MegaSena {

    public static final int NUMERO_MAXIMO = 60;
    public static final int QUANTIDADE_NUMEROS = 6;

    private int[] numerosSorteados;

    public void sortear(){
        this.numerosSorteados = new int[QUANTIDADE_NUMEROS];

        for (int i = 1; i <= QUANTIDADE_NUMEROS; i++){
            //gera numero aleatorio, arredonda e converte para inteiro
            int numeroSorteado = (int) Math.round(Math.random() * NUMERO_MAXIMO);

            //verifica se numero ainda nao foi sorteado e nao é 0
            if(!this.jaFoiSorteado(numeroSorteado) && numeroSorteado != 0){
                //adiciona o numero sorteado no array de numeros sorteados
                this.numerosSorteados[i-1] = numeroSorteado;
            } else {
                //decrementa i para refazer o sorteio da mesma posicao;
                i--;

            }
        }
    }

    public void exibirNumeros(){

        //este for chamamos de, for avançado ou for each, esse for esta percomendo o array inteiro
        // chamado numerosSorteados que esta dentro do numeroSorteado e para cada array que ele passa
        // ele faz um print do numero sorteado
        for (int numeroSorteado : numerosSorteados){
            System.out.println(numeroSorteado + " ");
        }
        //quebrar uma linha
        System.out.println();
    }

    private boolean jaFoiSorteado(int numero) {
        boolean resultado = false;
        for (int i = 0; i <= this.numerosSorteados.length; i++){
            if (this.numerosSorteados[1] == numero){
                resultado = true;
                break;
            }
        }
        return resultado;
    }
}
