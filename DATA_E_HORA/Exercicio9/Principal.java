package DATA_E_HORA.Exercicio9;

import java.util.Calendar;

/* Escreva um programa Java para obter o último dia do mês atual */

public class Principal {
   
    public static void main(String[] args) {
        Calendar c1 = Calendar.getInstance();
        
        System.out.println();
        System.out.println("Ultimo dia do mes atual: " + c1.getActualMaximum(Calendar.DAY_OF_MONTH));
        System.out.println();
        
    }

}
