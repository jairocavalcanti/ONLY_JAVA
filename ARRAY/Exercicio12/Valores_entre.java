package ARRAY.Exercicio12;

import java.util.Arrays;
import java.util.Scanner;

public class Valores_entre {


    public Valores_entre(){

    }


    public int arrayint(int[]array, int minimo, int maximo, Scanner scanner){
    for(int i = 0; i<array.length ;i++){
        System.out.print("Insira o elemento #" + i + " do array: "); 
         array[i] = scanner.nextInt();
        }
    
        System.out.println("-- ARRAY -- ");
        System.out.println(Arrays.toString(array));

        System.out.println();

         System.out.println("Numeros entre a minima e a maxima estabelecidas: ");
         for(int i = 0; i<array.length ;i++){
            if(i > minimo && i < maximo){
               System.out.print("[" + i + "]");
            }
         }
        return minimo;
    }  
}

