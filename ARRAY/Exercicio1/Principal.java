package ARRAY.Exercicio1;

import java.util.Arrays;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("insira o tamanho do seu vetor:");
        int T = scanner.nextInt();
        
        int vetor[] = new int[T];

        int contador = 1;
        System.out.println("Insira os elementos do vetor: ");
        for(int i = 0; i<vetor.length; i++){
             System.out.printf("#" + contador++ + " :");
             vetor[i] = scanner.nextInt();
        }
    
        System.out.println("Vetor: " + Arrays.toString(vetor));
    
        int soma = 0;
        for(int i = 0; i<vetor.length; i++){
            soma = soma += vetor[i];
        }
                     
        System.out.println("Soma dos elementos do vetor: " + soma );
        System.out.println("Media aritmetica do vetor: " + soma/vetor.length);
    
        scanner.close();
    } 
    


}
