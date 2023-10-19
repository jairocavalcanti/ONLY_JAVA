package ESTRUTURA_SEQUENCIAL.Exercicio3;
import java.util.Scanner;

/* Faça um Programa que peça dois números e imprima a soma */

public class Principal { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1 = 0;
        int numero2 = 0;
        int soma = 0;

        System.out.println("Insira um numero qualquer: ");
        numero1 = scanner.nextInt();

        System.out.println("Insira outro numero qualquer: ");
        numero2 = scanner.nextInt();

        soma = (numero1 + numero2);
        
        System.out.println("Soma dos dois numeros inseridos: " + soma);


        scanner.close();
    }
    
}
