package MATRIZ.Exercicio8;
import java.util.Scanner;

public class Operações {


   public void preencher_matriz_1(Scanner scanner,int linhas_1, int colunas_1,int matriz[][]){
      int cont_1 = 0;
      System.out.println();
      System.out.println(" -- MATRIZ_1 -- ");
      for(int i = 0; i < linhas_1; i++){
        for(int j = 0; j < colunas_1; j++){
            cont_1++;
            System.out.printf(" " + "Insira o elemento de numero #[ " + cont_1 + " ] :");
            matriz[i][j] = scanner.nextInt();
         }
      }
       System.out.println();
   }


   public void preencher_matriz_2(Scanner scanner, int linhas_2, int colunas_2, int matriz_2[][]){
      int cont_2 = 0;
      System.out.println();
      System.out.println(" -- MATRIZ_2 -- ");
      for(int i = 0; i < linhas_2; i++){
        for(int j = 0; j < colunas_2; j++){
            cont_2++;
            System.out.printf(" " + "Insira o elemento de numero #[ " + cont_2 + " ] :");
            matriz_2[i][j] = scanner.nextInt();
         }
      }
       System.out.println();
   }


   public void mostrar_matriz_1(int linhas_1, int colunas_1, int matriz[][]){
     System.out.println();
     System.out.printf(" -- Matriz_1 -- \n");
     for(int i = 0; i < linhas_1; i++){
        for(int j = 0; j < colunas_1; j++){
           System.out.printf(" [ " + matriz[i][j] + " ] ");
         }
        System.out.printf("%n");
      }
      System.out.println();  
   }

   
   public void mostrar_matriz_2(int linhas_2, int colunas_2, int matriz_2[][]){
     System.out.println();
     System.out.printf(" -- Matriz_2 -- \n");
     for(int i = 0; i < linhas_2; i++){
        for(int j = 0; j < colunas_2; j++){
           System.out.printf(" [ " + matriz_2[i][j] + " ] ");
         }
        System.out.printf("%n");
      }
      System.out.println();  
   }


   public int[][] somar_matrizes(int linhas_1, int colunas_1, int linhas_2, int colunas_2, int matriz_1[][], int matriz_2[][], int matriz_soma[][]){
     System.out.println();
     for(int i= 0; i < linhas_1; i++){
        for(int j = 0; j < colunas_2; j++){
          matriz_soma[i][j] = matriz_1[i][j] + matriz_2[i][j]; 
         }
      }
      return matriz_soma;
   }
  
 
   public void resultado_soma(int linhas_1, int colunas_2, int matriz_soma[][]){  
     System.out.println();
     System.out.printf(" -- Matriz resultado: SOMA -- \n");
     for(int i = 0; i < linhas_1; i++){
       for(int j = 0; j < colunas_2; j++){
          System.out.printf(" [ " + matriz_soma[i][j] + " ] ");
         }
       System.out.printf("%n"); 
      }
    System.out.println();  
   }


   public int[][] multiplicar_matrizes(int linhas_1, int colunas_1, int colunas_2, int matriz_1[][], int matriz_2[][], int matriz_multiplicacao[][]){
     System.out.println();
     for(int i = 0; i < linhas_1; i++ ){
       for(int j = 0; j < colunas_2; j++){
        matriz_multiplicacao[i][j] = 0;

        for(int k = 0; k < colunas_1; k++ ){
            matriz_multiplicacao[i][j] += matriz_1[i][k] * matriz_2[k][j];
            }  
          }
        }
        return matriz_multiplicacao;
   }
    

   public void resultado_multiplicacao(int linhas_2, int colunas_1, int matriz_multiplicacao[][]){
      System.out.println();
      System.out.printf(" -- Matriz resultado: MULTIPLICAÇÃO -- \n");
      for(int i = 0; i < linhas_2;i++){
         for(int j =0; j< colunas_1; j++){
            System.out.printf(" [ " + matriz_multiplicacao[i][j] + " ] ");
         }
       System.out.printf("%n"); 
      }
     System.out.println();  
   }



} 


