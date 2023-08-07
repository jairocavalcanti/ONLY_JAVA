package DATA_E_HORA.Exercicio7;

import java.util.Calendar;
import java.util.TimeZone;

/* Forma alternativa para resolução do problema */

public class Principal2 {
  
    public static void main(String[] args) {
        
        Calendar NewYork = Calendar.getInstance();
        NewYork.setTimeZone(TimeZone.getTimeZone("America/New_York"));
        System.out.println();

        System.out.println("Time in new York: " + NewYork.get(Calendar.HOUR_OF_DAY) 
        + ":" + NewYork.get(Calendar.MINUTE) + ":" + NewYork.get(Calendar.SECOND));
        System.out.println();

        

    }
    
}
