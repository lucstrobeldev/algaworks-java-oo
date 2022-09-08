package poo_v2.desafio.sobrecarga;

public class MaquinaCafe {
    int acucarDisponivel;

    void fazerCafe(){
        fazerCafe(10);
    }

    void fazerCafe(int quantidadeAcucar){
        if(acucarDisponivel < quantidadeAcucar){
            System.out.println("Nao ha acucar suficiente para fazer seu cafe.");
        } else {
            acucarDisponivel -= quantidadeAcucar;
            System.out.println("Fazendo cafezinho com " + quantidadeAcucar + " gramas de acucar.");
        }
    }
}
