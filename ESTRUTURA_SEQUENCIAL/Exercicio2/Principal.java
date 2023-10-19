package ESTRUTURA_SEQUENCIAL.Exercicio2;
import java.util.Scanner;

/* Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número] */

public class Principal {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numero = 0;

    System.out.println("Insira um numero inteiro qualquer: ");
    numero = scanner.nextInt();

    System.out.println("O numero informado foi [" + numero + "]");


    scanner.close();
   }
    
}
