package VETORES.Exercicio3;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Insira o tamanho dos vetores: ");
        int N = scanner.nextInt();

        System.out.println();

        int vetor[] = new int[N];

        int count = 1;
        System.out.println("Insira os dados do vetor: ");
        for(int i=0; i<vetor.length;i++){
            System.out.println("Item #" + count++ + ":");
            vetor[i] = scanner.nextInt();
        }
    
        count = 1;
        System.out.println();

        System.out.println("-- VETOR 1 --");
        for(int i =0; i<vetor.length;i++){
            System.out.println("[" + vetor[i] + "]");
        }

       System.out.println();

       System.out.println("----------------------------------------------");

       System.out.printf("Quantidade de numeros pares do vetor 1: ");
       System.out.println(parvetor(vetor)); 

       System.out.println();

       System.out.printf("Maior numero do vetor 1: ");
       System.out.println(maiorvetor(vetor));
      
       System.out.println("----------------------------------------------");

       System.out.println();


       int vetor2[] = new int[N];
        
       count = 1;
       System.out.println("Insira os dados do vetor 2: ");
       for(int i=0; i<vetor2.length;i++){
           System.out.println("Item #" + count++ + ":");
           vetor2[i] = scanner.nextInt();
       }
    
       System.out.println();

        System.out.println("-- VETOR 2 --");
        for(int i =0; i<vetor2.length;i++){
            System.out.println("[" + vetor2[i] + "]");
        }

        System.out.println();
    
        System.out.println(iguaisvetor(vetor,vetor2));
       
       scanner.close();
    }
  
    static int count2 = 0;
    //função recebendo vetor como parametro
    public static int parvetor(int[] x){
      for(int i =0; i< x.length;i++){
            if(x[i]%2 == 0){
                count2++;
            }
        }
    /*retorno do resultado da função 
    deve ser posta fora da estrutura de repetição*/
    return count2;
    }
 
    public static int maiorvetor(int[] x){
    /*funçao recebendo vetor como parametro 
    e retornando maior valor presente no mesmo*/
        int soma = x[0];
        for(int i=0; i<x.length; i++){
           if(x[i] > soma){
             soma = x[i];
            }
        }
       //retorno da função deve acontecer sempre FORA da estrutura de repetição
        return soma;
    }


    public static int iguaisvetor(int[] x, int[] y){
      int dados1 = 0;
      int dados2 = 0;
      int dados3 = 0;

      for(int i = 0; i< x.length;i++){
          dados1 = x[i];
        }
       
      for(int j = 0; j< y.length;j++){
          dados2 = y[j];   
        }  
          
        if(dados1 == dados2){
           dados3 += dados1;
        }
    
          return dados3;

    }

    //LINK DA LISTA: https://edirlei.com/aulas/tp2_2014_2/ListaExercicios05.html
}
