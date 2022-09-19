package datails_frameworks.string_methods.exemplos_string;

public class ExemploClasseString7 {
    public static void main(String[] args) {
        String s = "Cursos_Online_De_Desenvolvimento_De_Software";
        //String x = "12;40.30;12";

        String[] array = s.split("_");

        for (int i = 0; i < array.length; i++){
            System.out.println("[" + i + "]=" + array[i]);
        }
    }
}
