package MATRIZ.Exercicio5;
import java.util.Scanner;

 /* 
  Faça um programa para que o usuário preencha uma matriz 2x2
  Logo após o preenchimento, o programa deve mostrar a diagonal principal da matriz
 */

public class Principal {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int matriz[][] = new int[2][2];

    System.out.println("Insira os elementos da matriz: ");
    for(int i = 0;i<matriz.length;i++){
        for(int j = 0; j<matriz[i].length;j++){
            matriz[i][j] = scanner.nextInt();
        }
    }

    System.out.println();

    System.out.println("--- MATRIZ ---");
    for(int i = 0;i<matriz.length;i++){
        for(int j = 0; j<matriz[i].length;j++){
            System.out.printf("[" + matriz[i][j]+ "]");
        }
        System.out.printf("%n");
    }

    System.out.println();

    System.out.println("Diagonal Principal: ");
    for(int i = 0;i<matriz.length;i++){
         System.out.println(matriz[i][i]);  
    }

    System.out.println();

  
    scanner.close();
    }
  
   }
    

