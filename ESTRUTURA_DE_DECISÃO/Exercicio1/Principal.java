package ESTRUTURA_DE_DECISÃO.Exercicio1;
import java.util.Scanner;

/* Faça um Programa que peça dois números e imprima o maior deles */

public class Principal { 
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     int numero1 = 0;
     int numero2 = 0;

     System.out.println("Insira o primeiro numero :");
     numero1 = scanner.nextInt();
     
     System.out.println("Insira o segundo numero :");
     numero2 = scanner.nextInt();

     if(numero1 > numero2){
        System.out.println("Maior numero inserido: " + numero1);
     }else{
        System.out.println("Maior numero inserido: " + numero2 );
     }


     scanner.close();
 }
    
}
