package ESTRUTURA_DE_REPETIÇÃO.Exercicio8;
import java.util.Scanner;

/* Faça um programa que leia 5 números e informe a soma e a média dos números. */

public class Principal {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      Double soma_numeros = 0.0;


      for(int i = 0; i < 5; i++){
          System.out.println("Insira um numero: ");
          Double numero = scanner.nextDouble();

          soma_numeros += numero;

      }

      Double media = soma_numeros / 5;
      System.out.println("Soma dos numeros inseridos: " + soma_numeros);
      System.out.println("Media entre os numeros inseridos: " + media);

      scanner.close();
    }
}
