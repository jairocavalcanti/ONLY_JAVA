package DATA_E_HORA.Exercicio4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*Programa para pratica de adição de dias, meses e semanas a partir de uma determinada data */

public class Principal {
    public static void main(String[] args) {
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
       
        LocalDate d2 = LocalDate.now();
        LocalDate ultimodia = d2.plusDays(28);
      
        LocalDate d = LocalDate.parse("2023-01-01");
        LocalDate ultimomes = d.plusMonths(11);
        LocalDate ultimasemana = d.plusWeeks(51);

        System.out.println();

        System.out.println("Ultimo dia do mes 8(agosto): " + dtf.format(ultimodia));
        System.out.println("Ultimo mes do ano(2023): " + dtf.format(ultimomes));
        System.out.println("Ultima semana de 2023: " + dtf.format(ultimasemana));
        
    
    }
}