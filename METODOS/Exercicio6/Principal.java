package METODOS.Exercicio6;

import java.util.Scanner;

/*Programa para impressão de menor numero armazenado em vetor atraves de metodo*/

public class Principal {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      MenorNumero men = new MenorNumero();

      System.out.println("Insira o primeiro numero: ");
      double numero1 = scanner.nextDouble();

      System.out.println("Insira o segundo numero: ");
      double numero2 = scanner.nextDouble();

      System.out.println("Insira o terceiro numero: ");
      double numero3 = scanner.nextDouble();
 
      System.out.println();

      men.menornumero(numero1, numero2, numero3);

      scanner.close();
    }
    
   }
