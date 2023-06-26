package MATRIZ.Exercicio3;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int matriz[][] = new int [2][2];

        int count = 0;
        for(int i =0; i<matriz.length;i++){
            for(int j =0; j<matriz[i].length;j++){
                System.out.println("Insira o elemento #" + count++ + " :" );
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println();

        
        System.out.println("--- MATRIZ ---");
        for(int i = 0; i<matriz.length;i++){
            for(int j = 0; j<matriz.length; j++){
                System.out.printf("[" + matriz[i][j] + "]");
            }
            System.out.printf("%n");
        }

        System.out.println();

        int soma = 0;
        System.out.printf("Soma de numeros impares na matriz: ");
        for(int i =0; i<matriz.length;i++){
            for(int j =0; j<matriz[i].length;j++){
              if(matriz[i][j]%2 != 0){
                soma = soma + matriz[i][j];
                }
            }         
        }
        
        System.out.println("[" + soma + "]");
        
        System.out.println();

        System.out.printf("Soma das colunas da matriz: ");
       
        int soma1 = 0;
        int soma2 = 0;      
              
        //primeira posiçao: elemento
        //segunda posição: coluna
        soma1 = matriz[0][0] + matriz[1][0]; 
        soma2 = matriz[1][1] + matriz[0][1];
                
        

        System.out.println(" -- Coluna 1 : [" + soma1 + "]" + " -- Coluna 2: [" + soma2 + "]" );

        System.out.println();

        System.out.printf("Soma das linhas da matriz: ");

        int soma3 = 0;
        int soma4 = 0;
           
       
        soma3 = matriz[0][0] + matriz[0][1];
        soma4 = matriz[1][0] + matriz[1][1];
           
          
        System.out.println(" -- Linha 1 : [" + soma3 + "]" + " -- Linha 2 : [" + soma4 + "]");


        scanner.close();
    }
}
