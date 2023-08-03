package DATA_E_HORA.Exercicio3;

import java.util.Calendar;

/* Escreva um programa Java para obter e exibir informações 
  (ano, mês, dia, hora, minuto) sobre um calendário padrão. */

public class Principal2 {
    public static void main(String[] args) {
        
        Calendar calendario = Calendar.getInstance();

        System.out.println();
        System.out.println("Ano: " + calendario.get(Calendar.YEAR));
        System.out.println("Mes: " + calendario.get(Calendar.MONTH));
        System.out.println("Dia: " + calendario.get(Calendar.DATE));
        System.out.println("Hora: " + calendario.get(Calendar.HOUR));
        System.out.println("Minuto: " + calendario.get(Calendar.MINUTE));

        System.out.println("-- DATA HORA ATUAL --");
  
        System.out.println();

        System.out.println(calendario.getTime());


    }
}
