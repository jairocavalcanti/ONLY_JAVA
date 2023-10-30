package ESTRUTURA_DE_REPETIÇÃO.Exercicio7;
import java.util.Scanner;

/* Faça um programa que leia 5 números e informe o maior número */

public class Principal { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
         int maior_numero = 0;
        
         for(int i = 0; i < 5; i++){
         System.out.println("Insira o numero: ");
         int numero = scanner.nextInt();

         if(numero > maior_numero){
            maior_numero = numero;
            }  
        }


        System.out.println("Maior numero inserido: " + maior_numero);
   
        
        scanner.close();
    }
    
}
