package ESTRUTURA_SEQUENCIAL.Exercicio4;
import java.util.Scanner;

/*Faça um Programa que peça as 4 notas bimestrais e mostre a média */

public class Principal {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       double nota1 = 0;
       double nota2 = 0;
       double nota3 = 0;
       double nota4 = 0;

       System.out.println("Insira a primeira nota: ");
       nota1 = scanner.nextDouble();

       System.out.println("Insira a segunda nota: ");
       nota2 = scanner.nextDouble();

       System.out.println("Insira a terceira nota: ");
       nota3 = scanner.nextDouble();

       System.out.println("Insira a quarta nota: ");
       nota4 = scanner.nextDouble();

       double media = (nota1 + nota2 + nota3 + nota4) / 4.0;

       System.out.println("Media entre as notas inseridas: " + media);

       scanner.close();
    }
    
}
