package ESTRUTURA_DE_DECISÃO.Exercicio7;
import java.util.Scanner;

/* Faça um Programa que leia três números e mostre o maior e o menor deles */

public class Principal { 
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       double maior_numero = 0.0;
       double menor_numero = 0.0;
       double numero1 = 0.0;
       double numero2 = 0.0;
       double numero3 = 0.0;

       System.out.println("Insira o primeiro numero: ");
       numero1 = scanner.nextDouble();

       System.out.println("Insira o segundo numero: ");
       numero2 = scanner.nextDouble();

       System.out.println("Insira o terceiro numero: ");
       numero3 = scanner.nextDouble();


        if(numero1 > maior_numero){
          maior_numero = numero1;
        }
        if(numero2 > maior_numero){
          maior_numero = numero2;
        }
        if(numero3 > maior_numero){
          maior_numero = numero3;
        }       


        if(numero1 < numero2 && numero1 < numero3){
            menor_numero = numero1;
        }
        if(numero2 < numero1 && numero2 < numero3 ){
            menor_numero = numero2;
        }
        if(numero3 < numero1 && numero3 < numero2){
            menor_numero = numero3; 
        }
        
        System.out.println("Maior numero inserido: " + maior_numero);
        System.out.println("Menor numero inserido: " + menor_numero);
       

       scanner.close();
    }
    
}
