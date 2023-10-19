package ESTRUTURA_SEQUENCIAL.Exercicio5;
import java.util.Scanner;

/* Faça um Programa que converta metros para centímetros */

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Insira os metros a serem convertidos: ");
        double metros = scanner.nextDouble();

        double centimetros = (metros*100);

        System.out.println("Metros inseridos convertidos para centimetros: " + centimetros + "CM");

        scanner.close();
    }
    
}
