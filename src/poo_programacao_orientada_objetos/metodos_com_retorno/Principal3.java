package poo_programacao_orientada_objetos.metodos_com_retorno;

public class Principal3 {
    public static void main(String[] args) {
        Paciente p = new Paciente();
        p.peso = 100;
        p.altura = 1.65;

        IMC imc = p.calcularIMC();

        System.out.println("Abaixo do peso ideal: " + imc.abaixoDoPesoIdeal);
        System.out.println("Peso ideal: " + imc.pesoIdeal);
        System.out.println("Obeso: " + imc.obeso);
        System.out.println("Grau de obesidade: " + imc.grauObesidade);

    }
}
