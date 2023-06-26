package MATRIZ.Exercicio6;

import java.util.Scanner;

/*Crie em Java uma matriz 3x3 de inteiros, 
preencha a matriz e verifique se a matriz é um quadrado
mágico. Diz-se que uma matriz é um quadrado 
mágico quando a soma de todas as suas linhas, todas as
suas colunas, sua diagonal principal e sua 
diagonal secundária resultam no mesmo valor. Exemplo
abaixo.  */
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

         soma = 0;
         for(int i = 0; i<matriz.length; i++){
            for(int j = 0; j<matriz[i].length; j++){
               if(matriz[i][j] %2 == 0){
                 soma++;
               }
            }
        }
 
        System.out.println();

        Integer result = 0;
        System.out.println("Diagonal principal:");
        for(int i =0; i<matriz.length; i++){
            System.out.printf("[" + matriz[i][i] + "]");
            if(matriz[i][i] > 0){
              result = result += matriz[i][i];
            }
        }


        System.out.println();
        System.out.println("Soma da diagonal principal da matriz: " + result);

        System.out.println("-------------------------------");
        System.out.println("Numero pares da matriz:" + soma);

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
