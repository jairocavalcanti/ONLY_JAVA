package MATRIZ.Exercicio1;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.println("Insira o tamanho das linhas da matriz:");
      int L = scanner.nextInt();

      System.out.println("Insira a quantiade de colunas da matriz:");
      int C = scanner.nextInt();

      Integer matrix[][] = new Integer[L][C];

      System.out.println("Insira os elementos:");
      for(int i =0; i< matrix.length; i++){
        for(int j =0; j< matrix[i].length; j++){
            matrix[i][j] = scanner.nextInt();
        }
      }

      System.out.println();

     int c = 0;
      System.out.println("Elementos negativos inseridos na matriz:");
      for(int i =0; i< matrix.length; i++){
        for(int j =0; j< matrix[i].length; j++){
           if(matrix[i][j] < 0){
            System.out.println("[" + matrix[i][j] + "]");
             c++;
            }       
        }
      System.out.printf("%n");
    }

    if(c == 0){
      System.out.println(" -- Nenhum numero negativo inserido na matriz -- ");
    }

      scanner.close();  
    }
    


}
