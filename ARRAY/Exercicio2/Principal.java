package ARRAY.Exercicio2;

import java.util.Arrays;
import java.util.Scanner;

/*
// Codigo para criaçao de vetor com tamanho definido pelo usuario
// e obtençao de posiçao de elemento tambem inserido pelo usuario
 */
public class Principal {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Insira o tamanho do vetor: ");
    int t = scanner.nextInt();

    int vet[] = new int[t];

    System.out.println("Insira os elementos do vetor:");
    for(int i = 0; i< vet.length; i++){
       vet[i] = scanner.nextInt();
    }
    
    System.out.println("Vetor:" + Arrays.toString(vet));

    System.out.println("Insira o elemento que deseja achar no vetor:");
    int numero = scanner.nextInt();

    int repetidor = 0;
    for(int i=0; i< vet.length;i++){
       repetidor++;
        if(numero == vet[i]){
            System.out.println( "Elemento :" + vet[i] + " -- Posição: " + repetidor);
        }
    }

    scanner.close();
    
    }
    
}
