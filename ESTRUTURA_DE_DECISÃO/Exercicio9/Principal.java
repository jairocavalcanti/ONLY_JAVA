package ESTRUTURA_DE_DECISÃO.Exercicio9;
import java.util.Scanner;

/* Faça um Programa que leia três números e mostre-os em ordem decrescente */

public class Principal { 
    public static void main(String[] args) {
      Scanner scanner = new Scanner (System.in);

      System.out.println("Insira o numero #1: ");
      int numero1 = scanner.nextInt();

      System.out.println("Insira o numero #2: ");
      int numero2 = scanner.nextInt();

      System.out.println("Insira o numero #3: ");
      int numero3 = scanner.nextInt();

      System.out.println("----------------------------------------");
  
      System.out.println("Numeros inseridos: " + numero1 + " // " + numero2 + " // " + numero3);
        
       if(numero1 > numero2 && numero1 > numero3 ){
          System.out.println("Maior numero: " + numero1);
          if(numero2 > numero3){
            System.out.println("Numero do meio: " + numero2);
            System.out.println("Ultimo numero: " + numero3);
          }else{
            System.out.println("Numero do meio: " + numero3);
            System.out.println("Ultimo numero: " + numero2);
          }
        }
       
       if(numero2 > numero1 && numero2 > numero3 ){
          System.out.println("Maior numero: " + numero2);
          if(numero1 > numero3){
            System.out.println("numero do meio: " + numero1);
            System.out.println("Ultimo numero: " + numero3);
          }else{
            System.out.println("numero do meio:" + numero3);
            System.out.println("Ultimo numero: " + numero1);
          }
       }
       
       if(numero3 > numero2 && numero3 > numero1){
          System.out.println("Maior numero: " + numero3);
          if(numero2 > numero1){
            System.out.println("Numero do meio: " + numero2);
            System.out.println("Ultimo numero: " + numero1);
          }else{
            System.out.println("Numero do meio: " + numero1);
            System.out.println("Ultimo numero: " + numero2);
          }
        }    
       
     

      scanner.close();
    }
    
}
