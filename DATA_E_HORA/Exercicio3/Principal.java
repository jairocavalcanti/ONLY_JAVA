package DATA_E_HORA.Exercicio3;

import java.text.SimpleDateFormat;
import java.util.Date;

/* Escreva um programa Java para obter e exibir informações 
  (ano, mês, dia, hora, minuto) sobre um calendário padrão. */

public class Principal {
    public static void main(String[] args) {
  
        Date dat = new Date();
        SimpleDateFormat sdft = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println("Data e horario atual: " + sdft.format(dat));
    
    }
}
