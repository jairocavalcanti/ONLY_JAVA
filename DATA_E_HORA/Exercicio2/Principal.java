package DATA_E_HORA.Exercicio2;

import java.util.Calendar;

/* Escreva um programa Java para criar um objeto Date usando a classe Calendar  */

public class Principal {
    public static void main(String[] args) {
  
    int ano = 2023;
    int mes = 9;
    int dia = 17;

    Calendar calend = Calendar.getInstance();
     
    //" calend.clear(); " utilizado para retirar a hora local da impressao
    calend.clear();
    
    calend.set(Calendar.YEAR, ano);
    calend.set(Calendar.MONTH, mes);
    calend.set(Calendar.DATE, dia);
   
    System.out.println(calend.getTime());
   
   
    }
}
