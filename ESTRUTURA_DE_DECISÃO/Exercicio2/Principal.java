package ESTRUTURA_DE_DECISÃO.Exercicio2;
import java.util.Scanner;

/* Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo */

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1 = 0;

        System.out.println("Insira um numero qualquer: ");
        numero1 = scanner.nextInt();

        if(numero1 > 0){
            System.out.println("Valor inserido é positivo: " + numero1);
        }else{
            System.out.println("Valor inserido é negativo: " + numero1);
        }



        scanner.close();
    }
    
}
