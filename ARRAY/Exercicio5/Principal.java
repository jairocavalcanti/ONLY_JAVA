package ARRAY.Exercicio5;

import java.util.Arrays;
import java.util.Scanner;
/*Um algoritmo
que substitui por zero todos os valores ímpares do vetor */
public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int vetor[] = {1,2,3,4,5,6};

        System.out.println("Vetor original:");
        System.out.println(Arrays.toString(vetor));

        for(int i = 0; i<vetor.length;i++){
            if(vetor[i]%2 != 0){
                vetor[i] = 0;
            }
        }

        System.out.println();

        System.out.println("Vetor com numeros impares substituidos por '0': ");
        System.out.println(Arrays.toString(vetor));



        scanner.close();
    }
}
