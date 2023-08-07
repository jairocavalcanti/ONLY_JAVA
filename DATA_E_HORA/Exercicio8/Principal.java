package DATA_E_HORA.Exercicio8;

import java.util.Date;
import java.text.SimpleDateFormat;

/* Escreva um programa Java para obter a data e hora atuais */

public class Principal {
    public static void main(String[] args) {
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date d1 = new Date();
        
        System.out.println("Data e hora atuais: " + sdf.format(d1));
        

    }
}
