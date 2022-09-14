package topicos_avançados.datas;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TesteDatas {
    public static void main(String[] args) {
        Date hoje = new Date();
        System.out.println(hoje);

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(dateFormat.format(hoje));

        DateFormat dateFormat1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println(dateFormat1.format(hoje));

        //caminho contrario
        String dataAniversario = "20/01/1985";
        //converter essa string para tipo date
        DateFormat dateFormat3 = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date aniversario = dateFormat3.parse(dataAniversario);
            System.out.println(dateFormat3.format(aniversario));
        } catch (ParseException e) {
            System.out.println("Formato de data invalido");
        }
    }
}
