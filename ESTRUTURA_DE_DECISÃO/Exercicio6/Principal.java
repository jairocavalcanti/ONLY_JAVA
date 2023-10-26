package ESTRUTURA_DE_DECISÃO.Exercicio6;
import java.util.Scanner;

/* Faça um Programa que leia três números e mostre o maior deles */


public class Principal { 
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     int maior_numero = 0;

     System.out.println("Insira o numero #1: ");
     int numero1 = scanner.nextInt();

     System.out.println("Insira o numero #2: ");
     int numero2 = scanner.nextInt();

     System.out.println("Insira o numero #3: ");
     int numero3 = scanner.nextInt();

     if(numero1 > maior_numero){
        maior_numero = numero1;
        } 
     if(numero2 > maior_numero){
        maior_numero = numero2;
        } 
     if(numero3 > maior_numero){
        maior_numero = numero3;
        }
     System.out.println("Maior numero inserido: " + maior_numero);

     scanner.close();
    }
}
