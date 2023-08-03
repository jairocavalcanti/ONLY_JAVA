package DATA_E_HORA.Exercicio1;

import java.text.SimpleDateFormat;
import java.util.Date;

/* Programa para pratica de formatação de datas */

public class Principal {
    public static void main(String[] args) {
    Date date1 = new Date();
    Date date2 = new Date(1000L *60L * 60L *5L);
    SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
    SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    System.out.println();

    System.out.println("Data atual com horario BNT sem formatação: -- " + date1);
    System.out.println("Data atual sem horario formatada de acordo com 'sdf1': -- " + sdf1.format(date1));

    System.out.println();

    System.out.println("Data atual com horario formatada de acordo com 'sdf2': -- " + sdf2.format(date1));
    
    System.out.println(date2);

    }
}
