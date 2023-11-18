package ESTRUTURA_DE_REPETIÇÃO.exercicio10;
import java.util.Scanner;

/* 
 Faça um programa que receba dois numeros inteiros e gere 
 os números inteiros que estão no intervalo compreendido por eles 
*/

public class Principal {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       System.out.println("Insira o numero 1: ");
       int numero1 = scanner.nextInt();

       System.out.println("Insira o numero 2: ");
       int numero2 = scanner.nextInt();
 

    System.out.println(" -- Numeros presentes no intervalo entre o numero_1 e numero_2 -- ");   
    System.out.println("----------------------------------------------------------------------");
    if(numero1 > numero2){
          
       for(int i = 0; i < numero1; i++ ){
           numero2++;
           System.out.printf("[" + numero2 + "] ");
           if(numero2 == (numero1 - 1)){
            break;
           }
        }
       
    }
    
    
    if(numero2 > numero1){
          
       for(int i = 0; i < numero2; i++ ){
           numero1++;
           System.out.printf("[" + numero1 + "] ");
           if(numero1 == (numero2 - 1)){
            break;
           }
        }
       
    }

    System.out.println();
    System.out.println("----------------------------------------------------------------------");


       scanner.close();
    }
}
