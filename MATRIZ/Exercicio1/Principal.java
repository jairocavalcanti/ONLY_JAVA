package MATRIZ.Exercicio1;
import java.util.Scanner;

/* 
  Faça um programa que gere uma matriz de proporções definidas pelo usuário, 
  mostre a matriz preenchida também pelo usuário e exiba uma mensagem e a 
  quantidade de numeros negativos na matriz caso algum dos elementos inseridos seja negativo
*/

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
      System.out.println(" -- MATRIZ -- ");
      for(int i =0; i< matrix.length; i++){
        for(int j =0; j< matrix[i].length; j++){
          System.out.printf("[" + matrix[i][j] + "]");
           if(matrix[i][j] < 0){
             c++;
            }       
        }
      System.out.printf("%n");
    }

    if(c == 0){
      System.out.println(" -- Nenhum numero negativo inserido na matriz -- ");
    }else{
      System.out.println("Elementos negativos inseridos na matriz: " + c);
    }

      scanner.close();  
    }
    


}
