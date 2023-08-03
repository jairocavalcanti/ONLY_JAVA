package METODOS.Exercicio10;

import java.util.Scanner;

public class Principal {
    
    /* Escreva um método Java para calcular a soma dos dígitos em um número inteiro */

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
      
       System.out.println("Insira um numero: ");
       double numero = scanner.nextDouble();

       System.out.println("Soma dos digitos do numero inserido: " + Somador.somador(numero)); 
      
       /* 
        numero1 /= 9;
       
        operação acima e o mesmo de:
        
        numero1 = numero1/9 
        */
      
 
        scanner.close();
    }
    
}
