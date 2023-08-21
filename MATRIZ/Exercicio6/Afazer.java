package MATRIZ.Exercicio6;

import java.util.Scanner;

/*
Crie em Java uma matriz 2x2 de inteiros, 
preencha a matriz e verifique se a matriz é um quadrado
mágico. Diz-se que uma matriz é um quadrado 
mágico quando a soma de todas as suas linhas, todas as
suas colunas, sua diagonal principal e sua 
diagonal secundária resultam no mesmo valor. Exemplo
abaixo.  
*/
public class Afazer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        Integer soma;
        Integer matriz[][] = new Integer[2][2];

        int contador = 0;
       
        System.out.println("Insira os elementos da matriz:");
        for(int i = 0; i<matriz.length; i++){
            for(int j = 0; j<matriz[i].length; j++){
                System.out.printf("#" + contador++ + ": ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println();

        System.out.println("Matriz:");
        for(int i = 0; i<matriz.length; i++){
            for(int j = 0; j<matriz[i].length; j++){
                System.out.printf(" [ " + matriz[i][j] + " ] " );
            } 
            System.out.printf("%n");
        }

 
        System.out.println();

        Integer result = 0;
        System.out.println("Diagonal principal: ");
       for(int i =0; i<matriz.length; i++){
            System.out.printf("[" + matriz[i][i] + "]");
            if(matriz[i][i] > 0){
              result = result += matriz[i][i];
            }
        }

      
        System.out.println("\n----------------------------------------");


        Integer result2 = 0;
        System.out.println("Diagonal secundaria: ");
        for(int i = 0; i<matriz.length; i++){
            System.out.printf("[" + matriz[i][matriz.length - 1 -i] + "]");
            if (matriz[i][matriz.length - 1 - i] > 0) {
               result2 += matriz[i][matriz.length - 1 - i];
        }
     }

       System.out.println("\n----------------------------------------");
       System.out.println("\n----------------------------------------");



       int linhas = 0;
       System.out.println("Primeira LINHA da matriz: ");
        for(int i = 0; i < matriz.length; i++){
            System.out.printf("[" + matriz[0][linhas++] + "]");
        }
     
        System.out.println();

       int linhas2 = 0;
       System.out.println("Segunda LINHA da matriz: ");
        for(int i = 0; i < matriz.length; i++){
            System.out.printf("[" + matriz[1][linhas2++] + "]");
        }
        
        System.out.println("\n----------------------------------------");

       //\n
        
        System.out.println("Soma da diagonal principal da matriz: " + result + "\n");


        System.out.println("Soma da diagonal secundaria da matriz: " + result2);


        System.out.println();
            


       /*  
        Integer result2 = 0;
        System.out.println("Primeira coluna da matriz:");
        for(int i = 0; i<matriz.length; i++){
            for(int j = 0; j<matriz[i].length; j++){
              if(j>0){
                System.out.println("[" + matriz[i][j-1] + "]");   
                 result2 = result2 +=  matriz[i][j-1]; 
                }
            }
        } 
        */


        scanner.close();
    
  }
}