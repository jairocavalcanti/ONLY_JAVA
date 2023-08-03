package DATA_E_HORA.Exercicio5;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

/* Definindo uma formataçao para um tipo calendar */

public class Principal {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
        
        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        d = cal.getTime();
        
        System.out.println(sdf.format(d));
    }
}
