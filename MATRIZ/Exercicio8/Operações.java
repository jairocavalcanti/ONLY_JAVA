package MATRIZ.Exercicio8;
import java.util.Scanner;

public class Operações {


   public void preenchers_matriz_1(Scanner scanner,int linhas_1, int colunas_1,int matriz[][]){
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


   public int[][] somarmatrizes(int linhas_1, int colunas_1, int linhas_2, int colunas_2, int matriz_1[][], int matriz_2[][], int matriz_soma[][]){
    
     if(linhas_1 == linhas_2 && colunas_1 == colunas_2){

     for(int i= 0; i < linhas_1; i++){
        for(int j = 0; j < colunas_2; j++){
          matriz_soma[i][j] = matriz_1[i][j] + matriz_2[i][j]; 
        }
      }
      return matriz_soma;
   
    }else{
   
    System.out.println("!! Impossível somar matrizes, matrizes acima não possuem as mesmas dimensões !! \n");
    return null;
   }
 }
  
 
   public void resultado_soma(int linhas_1, int colunas_1, int linhas_2, int colunas_2, int matriz_1[][], int matriz_2[][], int matriz_soma[][]){  
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

  public int[][] mutiplicacao(){
   
  }

}
