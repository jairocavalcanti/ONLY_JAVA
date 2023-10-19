package ESTRUTURA_SEQUENCIAL.Exercicio9;
import java.util.Scanner;

/* Faça um Programa que peça a temperatura em graus Fahrenheit, 
transforme e mostre a temperatura em graus Celsius.
C = 5 * ((F-32) / 9) */

public class Principal { 
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
    
       System.out.println("Insira a temperatura fahrenheit a ser convertida em celsius: ");
       double fahrenheit = scanner.nextDouble();

       double celsius = 5 * ((fahrenheit-32) / 9);

       System.out.println("Temperatura em fahrenheit convertida para celsius: " + celsius );


       scanner.close();
    }  
}
