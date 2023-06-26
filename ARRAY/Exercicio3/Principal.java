package ARRAY.Exercicio3;

import java.util.Arrays;
import java.util.Scanner;

//Escreva um programa Java para remover um elemento específico de um array.
public class Principal {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("Insira o tamanho do vetor:");
        int t = scanner.nextInt();

        int vet[] = new int[t];

        int contador = 1;
        System.out.println("insira os elementos do vetor:");
        for(int i = 0; i< vet.length; i++){
            System.out.println("#" + contador++ + ":" );
            vet[i] = scanner.nextInt();
        }

        System.out.println("Vetor:" + Arrays.toString(vet));
         
        System.out.println();
       
        scanner.close();
    }
}
