package DATA_E_HORA.Exercicio8;

import java.util.Calendar;

/* Forma alternativa para resolução do problema */

public class Principal2 { 
    public static void main(String[] args) {
    
        Calendar now = Calendar.getInstance();

        System.out.println();

        System.out.println("-- INFORMAÇÕES ATUAIS --");

        System.out.println("-----------------------------");

        System.out.println("Dia:  -- " + now.get(Calendar.DATE));
        System.out.println("Mes:  -- " + now.get(Calendar.MONTH));
        System.out.println("Ano:  -- " + now.get(Calendar.YEAR));
        System.out.println("Hora: -- " + now.get(Calendar.HOUR));
        System.out.println("Minutos: -- " + now.get(Calendar.MINUTE));
        System.out.println("Segundos: -- " + now.get(Calendar.SECOND));
        System.out.println("Milissegundos: -- " + now.get(Calendar.MILLISECOND));
        System.out.println();
        System.out.println(now.getTime());

    }
    
}
