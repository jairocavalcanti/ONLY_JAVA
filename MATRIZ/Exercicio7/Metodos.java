package MATRIZ.Exercicio7;
import java.util.Scanner;

/*
Escreva um programa em Java que realize a multiplicação de duas matrizes quadradas de ordem n. 
O programa deve solicitar ao usuário que insira o tamanho da matriz (ordem n). 
Em seguida, o programa deve pedir ao usuário para preencher os elementos das duas matrizes. 
Após a multiplicação, o programa deve exibir o resultado da multiplicação das matrizes.

Dicas:

Crie métodos separados para preencher as matrizes, realizar a multiplicação e exibir o resultado.
Lembre-se de que a multiplicação de duas matrizes é possível se o número de colunas da primeira matriz 
for igual ao número de linhas da segunda matriz.
*/

public class Metodos {

    public void preenchermatrizes(int linhas_1, int colunas_1 , int linhas_2, int colunas_2 , int matriz[][] , int matriz2[][], Scanner scanner){

        System.out.println("-----------------------------------------------------");

        System.out.println("Insira os elementos da MATRIZ_1 : ");
        int contador1 = 1;
        int contador2 = 1;

        for(int i = 0; i < linhas_1; i++){
            for(int j = 0; j < colunas_1; j++){
                System.out.println("Insira o elemento #" + (contador1++) + " :");
                matriz[i][j] = scanner.nextInt();
            }
        }

       System.out.println("-----------------------------------------------------");

       System.out.println("Insira os elementos da MATRIZ_2 : ");
         for(int i = 0; i < linhas_2; i++){
            for(int j = 0; j < colunas_2; j++){
                System.out.println("Insira o elemento #" + (contador2++) + " :");
                matriz2[i][j] = scanner.nextInt();
            }
        }
    
        System.out.println("-----------------------------------------------------");
    
    }


    public void mostrarmatrizes(int linhas_1, int colunas_1 , int linhas_2, int colunas_2 ,int matriz1[][], int matriz2[][]){
        
        System.out.println("Elementos da MATRIZ_1 : ");
        for(int i = 0; i < linhas_1; i++){
            for(int j = 0; j < colunas_1; j++){
                System.out.printf("[" + matriz1[i][j] + "]");
            }
        System.out.printf("%n");
        }
       
        System.out.println("-----------------------------------------------------");

        System.out.println("Elementos da MATRIZ_2 : ");
        for(int i = 0; i < linhas_2; i++){
            for(int j = 0; j < colunas_2; j++ ){
                System.out.printf("[" + matriz2[i][j] + "]");
            }
        System.out.printf("%n");   
        }
    }


    public void multiplicarmatrizes(int linhas_1, int colunas_1 , int linhas_2, int colunas_2 , int matriz1[][], int matriz2[][]){

        if(colunas_1 != linhas_2){
            System.out.println("Nao foi possivel multiplicar as matrizes !");
            System.out.println( "número de colunas da primeira matriz diferente do número de linhas da segunda matriz !");
           
        }else{

        int resultado [][] = new int[linhas_1][colunas_2];

        for(int i =0; i < linhas_1; i++){
            for(int j =0; j < colunas_2; j++){
                for(int k = 0; k < colunas_1; k++){
                   resultado[i][j] += matriz1[i][k] * matriz2[k][j];
                }
             }
          }
        
        System.out.println("-----------------------------------------------------");
        System.out.println(" -- Matriz resultante das matrizes multiplicadas -- ");  
        System.out.println("-----------------------------------------------------");  

        for(int i= 0; i< linhas_1; i++){
            for(int j = 0; j< colunas_2; j++){
                System.out.printf("[ " + resultado[i][j] + " ]");
            }
            System.out.printf("%n");
        }
     }
   }
 }
   

          
  

