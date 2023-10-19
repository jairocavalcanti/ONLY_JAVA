package ESTRUTURA_SEQUENCIAL.Exercicio6;
import java.util.Scanner;

/* Faça um Programa que peça o raio de um círculo, calcule e mostre sua área */

public class Principal {
    
    //'private static final' permite que a variavel detenha um valor que nao pode ser alterado, tornando-se assim, uma constante
    private static final double PI = 3.14;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double raio = 0;

       System.out.printf("Insira o raio do circulo: ");
       raio = scanner.nextDouble();

       double area = PI *(raio*raio); 

       System.out.println("Area do circulo de acordo com o raio inserido: " + area + "m");

       scanner.close();
    }
    
}
