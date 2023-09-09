package ARRAY.Exercicio13;

/*
Crie um programa em Java que implemente a função uniao. 
Essa função Crie uma função  recebe como parâmetros dois arrays de inteiros e 
retorna um novo array contendo a  união de v1 e v2. 
Por exemplo, se v1 = {11, 13, 45, 7} e v2 = {24, 4, 16, 81, 10, 12}, 
v3 irá  conter {11, 13, 45, 7, 24, 4, 16, 81, 10, 12}.  
Em seguida, crie a função principal do programa para chamar a função uniaopassando  
dois arrays informados pelo usuário (ou declarados estaticamente). 
Em seguida, o  programa deve exibir na tela os elementos do array resultante
*/

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Uniao uniao = new Uniao();  
    
    System.out.println("Insira o tamanho dos vetores: ");
    int N = scanner.nextInt();

    int N2 = (N*2);

     int array1[] = new int[N];
     int array2[] = new int[N];
     int array3[] = new int[N2];

     System.out.println();

     System.out.println("--- Insira os elementos do array1 --- ");
     System.out.println("--- = --- = --- = --- = --- = --- =");
     for(int i = 0; i< array1.length; i++){
        System.out.println("Insira o elemento #" + i + " do ARRAY1:");
        array1[i] = scanner.nextInt();
     }

     System.out.println();

      System.out.println("--- Insira os elementos do array2 --- ");
      System.out.println("--- = --- = --- = --- = --- = --- =");
      for(int i = 0; i< array2.length; i++){
        System.out.println("Insira o elemento #" + i + " do ARRAY2:");
        array2[i] = scanner.nextInt();
     }

     uniao.uni(array1, array2, array3);

    scanner.close();
    }
    
}
