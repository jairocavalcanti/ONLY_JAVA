package DATA_E_HORA.Exercicio2;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Principal2 {
    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();
        Date date = new Date();
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");

        int ano = 1992;
        int mes = 8;
        int dia = 17;
        calendario.clear();

        calendario.set(Calendar.YEAR, ano);
        calendario.set(Calendar.MONTH, mes);
        calendario.set(Calendar.DATE, dia);
        System.out.println();

        System.out.println(sdf1.format(date));

        System.out.println(calendario.getTime());
   
    }
    
}
