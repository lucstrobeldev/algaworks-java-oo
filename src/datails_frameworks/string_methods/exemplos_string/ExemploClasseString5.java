package datails_frameworks.string_methods.exemplos_string;

public class ExemploClasseString5 {
    public static void main(String[] args) {
        // metodos sub strings, (public String substring(int beginIndex))
        // e tambem, (public String substring(int beginIndex, int endIndex))

        String s = "Desenvolvimento Java";
        System.out.println(s.substring(16));
        System.out.println(s.substring(1, 10));
    }
}
