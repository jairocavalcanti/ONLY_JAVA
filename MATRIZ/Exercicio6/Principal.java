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
public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
       
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
       int somalinha = 0;
       System.out.println("Primeira LINHA da matriz: ");
        for(int i = 0; i < matriz.length; i++){
          int elemento = matriz[linhas][i];
          somalinha += elemento;
          System.out.printf("[" + elemento + "]");
        }
     
       System.out.println();

       int linhas2 = 1;
       int somalinha2 = 0;
       System.out.println("Segunda LINHA da matriz: ");
        for(int i = 0; i < matriz.length; i++){
             int elemento = matriz[linhas2][i];
             somalinha2 += elemento;
             System.out.printf("[" + elemento + "]");
        }
        
        System.out.println("\n----------------------------------------");

      
        int coluna = 0;
        int somacoluna = 0;
        System.out.println("Primeira COLUNA da matriz: ");
         for(int i = 0; i < matriz.length; i++){
            int elemento = matriz[i][coluna];
            somacoluna += elemento;
            System.out.println("[" + elemento + "]");
        }
        

        System.out.println();
       

        int coluna2 = 1;
        int somacoluna2 = 0;
        System.out.println("Segunda COLUNA da matriz: ");
         for(int i = 0; i< matriz.length; i++){
            int elemento = matriz[i][coluna2];
            somacoluna2 += elemento;
            System.out.println("[" + elemento + "]");
        }




         System.out.println("\n----------------------------------------");

         //\n
        
         System.out.println("Soma da diagonal principal da matriz: " + result + "\n");

         System.out.println("Soma da diagonal secundaria da matriz: " + result2 + "\n");



         System.out.println("---------------- LINHAS ----------------");

         System.out.println("Soma primeira LINHA da matriz: " + somalinha + "\n");

         System.out.println("Soma segunda LINHA da matriz: " + somalinha2 + "\n"); 

         

         System.out.println("---------------- COLUNAS ----------------");

         System.out.println("Soma da primeira COLUNA da matriz: " + somacoluna + "\n");

         System.out.println("Soma da segunda COLUNA da matriz: " + somacoluna2 + "\n");


        boolean quadradomagico = result.equals(result2)    &&
                                 result.equals(somalinha)  &&
                                 result.equals(somalinha2) &&
                                 result.equals(somacoluna) &&
                                 result.equals(somacoluna2); 

        if(quadradomagico){
            System.out.println("A matriz acima é um quadrado mágico !!");
        }else{
            System.out.println("A matriz acima não é um quadrado mágico");
        }


         scanner.close();
    }
}