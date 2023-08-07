package DATA_E_HORA.Exercicio10;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/* Escreva um programa Java para calcular o primeiro e o último dia de cada semana */

public class Principal { 
    public static void main(String[] args) {
        LocalDate lc01 = LocalDate.parse("2023-08-07");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
 
        LocalDate ps = lc01.minusDays(6);
        LocalDate ps2 = lc01.minusDays(0);

        LocalDate ss = lc01.plusDays(0);
        LocalDate ss2 = lc01.plusDays(7);

        LocalDate ts = lc01.plusDays(7);
        LocalDate ts2 = lc01.plusDays(14);

        LocalDate qs = lc01.plusDays(14);
        LocalDate qs2 = lc01.plusDays(21);

        LocalDate dr2 = lc01.plusDays(22);
        LocalDate dr3 = lc01.plusDays(23);
        LocalDate dr4 = lc01.plusDays(24);

        System.out.println();

         System.out.println("Data : " + lc01);
         System.out.println("Data formatada: " + dtf.format(lc01));
              
         System.out.println();

         System.out.println("Primeiro dia da primeira semana do mes: " + dtf.format(ps));
         System.out.println("Ultimo dia da primeira semana do mes: " + dtf.format(ps2));

         System.out.println();

         System.out.println("Primeiro dia da segunda semana do mes: " + dtf.format(ss));
         System.out.println("Ultimo dia da segunda semana do mes: " + dtf.format(ss2));

         System.out.println();

         System.out.println("Primeiro dia da terceira semana do mes: " + dtf.format(ts));
         System.out.println("Ultimo dia da terceira semana do mes: " + dtf.format(ts2));

         System.out.println();

         System.out.println("Primeiro dia da quarta semana do mes: " + dtf.format(qs));
         System.out.println("Ultimo dia da quarta semana do mes: " + dtf.format(qs2));
  
         System.out.println();

         System.out.println(" --- DIAS RESTANTES --- ");
         
         System.out.println("Dia: " + dr2);
         System.out.println("Dia: " + dr3);
         System.out.println("Dia: " + dr4);

    }
    
}
