package ARRAY.Exercicio14;
import java.util.Scanner;

/* 
 Escreva um programa em Java que encontre o maior elemento em um vetor de inteiros. O programa deve realizar as seguintes etapas:
 Peça ao usuário para inserir o tamanho do vetor.
 Peça ao usuário para inserir os elementos do vetor um por um.
 Encontre e exiba o maior elemento no vetor.
 Caso haja elementos com valores iguais ao maior, exiba todas as posições em que eles estão no vetor.
 */

public class Principal {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.println("Insira o tamanho do vetor a serem inseridos os elementos: ");
      int tamanho = scanner.nextInt();

      int vetorinteiros[] = new int[tamanho]; 

      Maiorelemento ME = new Maiorelemento();
      ME.maiorelemento(vetorinteiros, scanner);

    
     scanner.close();
    }
    
}
