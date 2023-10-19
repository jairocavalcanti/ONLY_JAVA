package ESTRUTURA_SEQUENCIAL.Exercicio10;
import java.util.Scanner;

/* Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit 
 * F = C x 1,8 + 32
*/

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira a temperatura em celsius a ser convertida para fahrenheit: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 1.8) + 32;

        System.out.println("Temperatura em celsius convertida para fahrenheit: " + fahrenheit);

        
        scanner.close();
    }
}
