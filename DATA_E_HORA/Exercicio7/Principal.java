package DATA_E_HORA.Exercicio7;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;


public class Principal {
    
    /* Escreva um programa Java para obter a hora atual em Nova York. */
    /* formato Instant - "2017-08-23T21:34:45Z"  */
    
    public static void main(String[] args) {
        Instant ins = Instant.now();
        LocalDateTime ldt = LocalDateTime.ofInstant(ins, ZoneId.of("America/New_York"));
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
 
        System.out.println();

        System.out.println("Horario zulu: " + ins);
       
        System.out.println();

        System.out.println("Horario em Nova York: " + dtf.format(ldt));

        System.out.println();


    }
}
