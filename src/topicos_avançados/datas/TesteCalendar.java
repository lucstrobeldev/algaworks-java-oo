package topicos_avançados.datas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TesteCalendar {
    public static void main(String[] args) {
        Calendar c = new GregorianCalendar();

        c.set(Calendar.DAY_OF_MONTH, 31);
        c.set(Calendar.MONTH, 0);
        c.set(Calendar.YEAR, 2020);
        c.set(Calendar.HOUR_OF_DAY, 10);
        c.set(Calendar.MINUTE, 32);
        c.set(Calendar.SECOND, 26);

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println(dateFormat.format(c.getTime()));

        c.add(Calendar.MONTH, 1);
        System.out.println(dateFormat.format(c.getTime()));

        c.roll(Calendar.DAY_OF_MONTH, 1);
        System.out.println(dateFormat.format(c.getTime()));


    }
}
