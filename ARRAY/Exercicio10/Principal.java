package ARRAY.Exercicio10;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
  Programa para criaçao de vetor com numeros randomicos
  Tamanho do vetor definido pelo usuario
 */
public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rando = new Random(10);
  
        System.out.println("Insira o tamanho do vetor:");
        int T = scanner.nextInt();
    
        System.out.println();
    
        int vet[] = new int[T];
        
        System.out.println("vetor de numeros randomicos:");
        for(int i =0; i<vet.length; i++){
            vet[i] = rando.nextInt();
        }
     
        System.out.println(Arrays.toString(vet));

       scanner.close();


    }
    
}
