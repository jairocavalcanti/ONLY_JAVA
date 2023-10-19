package ESTRUTURA_SEQUENCIAL.Exercicio7;
import java.util.Scanner;

/* Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário */

public class Principal { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double lado = 0;

        System.out.println("Insira o valor de um dos lados do quadrado: ");
        lado = scanner.nextDouble();
        
        double area = (lado * lado);
        double dobro_area = (area * 2);

        System.out.println("Area do quadrado: " + area );
        System.out.println("Dobro da area do quadrado: " + dobro_area);


        scanner.close();
    }
    
}
