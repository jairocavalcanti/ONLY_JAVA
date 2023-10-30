package ESTRUTURA_DE_REPETIÇÃO.Exercicio6;
import java.util.Scanner;

/* 
 Faça um programa que imprima na tela os números de 1 a 20, um abaixo do outro. 
 Depois modifique o programa para que ele mostre os números um ao lado do outro.  
*/

public class Principal {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      
    //imprimindo numeros um abaixo do outro 
    for(int i =1 ; i < 21; i++){
        System.out.println(" " + i);
    }

    System.out.println("----------------------------------------------------");

    //imprimindo numeros lado a lado
    for(int i =1 ; i < 21; i++){
        System.out.printf(" " + i);
    }

      scanner.close();
    }   
}
