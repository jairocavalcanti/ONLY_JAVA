package MATRIZ.Exercicio4;
import java.util.Scanner;

/* 
  Faça um programa que conte a quantidade de numeros pares e impares
  numeros precisam ser inseridos pelo usuario em uma matriz 2x2
*/

public class Principal {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
  
    Integer matriz[][] = new Integer[2][2];
      
      System.out.println("Insira os elementos da matriz:");
      for(int i = 0; i<matriz.length; i++){
        for(int j = 0; j<matriz[i].length; j++){
            matriz[i][j] = scanner.nextInt();
        }
    }
   
      System.out.println();

      int count = 0;
      for(int i = 0; i<matriz.length; i++){
        for(int j = 0; j<matriz[i].length;j++){
            if(matriz[i][j]%2 == 0 ){
                count++;
            }
        }
    }

    int count2 = 0;
      for(int i = 0; i<matriz.length; i++){
        for(int j = 0; j<matriz[i].length;j++){
            if(matriz[i][j]%2 != 0 ){
               count2++;
        }
      }
    }

    System.out.println("--- MATRIZ ---");
    for(int i = 0; i<matriz.length;i++){
        for(int j = 0; j<matriz.length; j++){
            System.out.printf("[" + matriz[i][j] + "]");
        }
        System.out.printf("%n");
    }

      System.out.println();

      System.out.println("Quantidade de numeros pares: " + count);
   
      System.out.println();

      System.out.println("Quantidade numeros impares: " + count2);

      scanner.close();
}
    
}
