package DATA_E_HORA.Exercicio6;

import java.util.Calendar;

/*Programa para impressao de dados maximos em data */

public class Principal {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        System.out.println();
        System.out.println("Data atual: " + cal.getTime());

        System.out.println();
        System.out.println("Dia maximo do mes: " + cal.getMaximum(Calendar.DATE));
        System.out.println("Mes maximo atual: " + cal.getMaximum(Calendar.MONTH));
        System.out.println("Ano maximo atual: " + cal.getMaximum(Calendar.YEAR));
        System.out.println("Semana maxima atual: " + cal.getMaximum(Calendar.WEEK_OF_YEAR));



          



    }
}
