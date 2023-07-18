package METODOS.Exercicio5;

import java.util.Scanner;
/* Escreva um método Java para calcular a média de três números */


public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       System.out.println("Insira o primeiro numero: ");
       double numero1 = scanner.nextDouble();

       System.out.println("Insira o segundo numero: ");
       double numero2 = scanner.nextDouble();

       System.out.println("Insira o terceiro numero: ");
       double numero3 = scanner.nextDouble();

       Media med = new Media(numero1, numero2, numero3);

       System.out.println("O valor médio é: " + med.media2());


       scanner.close();
    }
    
}
