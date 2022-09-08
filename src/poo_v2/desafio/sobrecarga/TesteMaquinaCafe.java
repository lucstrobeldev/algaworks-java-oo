package poo_v2.desafio.sobrecarga;

public class TesteMaquinaCafe {
    public static void main(String[] args) {
        MaquinaCafe maquinaCafe = new MaquinaCafe();
        maquinaCafe.acucarDisponivel = 30;

        maquinaCafe.fazerCafe(10);
        maquinaCafe.fazerCafe(15);

        //faz cafe com a quantidade de acucar padrao
        //nao sera possivel fazer esse cafezinho, pois a maquina
        //só tinha 30g de acucar disponivel
        maquinaCafe.fazerCafe();
    }
}
