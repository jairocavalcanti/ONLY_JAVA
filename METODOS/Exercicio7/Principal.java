package METODOS.Exercicio7;

import java.util.Scanner;

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
