package ARRAY.Exercicio6;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

    static int[] vetor;
    int tamanho;


    public static void criaVetor(int tamanho, Scanner scanner){
        vetor = new int[tamanho];
        

        System.out.println("Insira os dados do vetor: ");
        int contador = 1;
        for(int i =0;i<vetor.length;i++){
            System.out.printf("#" + contador++ + ":");
            vetor[i] = scanner.nextInt();
        }
 
        System.out.println("Vetor: " + Arrays.toString(vetor));
    
    }

    
    public static void somavetor(){
    int soma = 0;    
        for(int i = 0; i< vetor.length; i++){
           soma = soma += vetor[i];
        }
     
        System.out.println("Soma do vetor: " + soma);
    
    }


    public static void media(){
    int soma2 = 0;
        for(int i = 0; i< vetor.length;i++){
            soma2 = soma2 += vetor[i];
        }
    int calculomedia = 0;
        calculomedia = soma2/vetor.length;    
    System.out.println("Media dos numeros do vetor: " + calculomedia);
    }


    public static void obtemelementodoarray(Scanner scanner){
       
        System.out.printf("Insira a posiçao do vetor a qual deseja capturar o elemento: ");
        int posiçao = scanner.nextInt();
        
        System.out.printf("Elemento inserido na posição " + posiçao + " do vetor: ");
        System.out.println(vetor[posiçao]);
    }
    

    public static void inserelementonoarray(Scanner scanner){
        
        System.out.printf("Insira a posiçao do vetor que deseja inserir um elemento: ");
        int posiçao2 = scanner.nextInt();

            System.out.printf("Insira o novo elemento: ");
            vetor[posiçao2] = scanner.nextInt();
        

        System.out.printf("Vetor alterado: ");
        System.out.println(Arrays.toString(vetor));
    }
    

      public static void maiorlemento(){
       int maiornumero = vetor[0];

        for(int i = 0; i< vetor.length; i++){
            if(vetor[i] > maiornumero){
               maiornumero = vetor[i];
            }
        }

        if(maiornumero == 0){
            System.out.println("--Numero impar substituido por 0--");
        }else{
             System.out.println("Maior numero do vetor: " + maiornumero);
        }
      
    }


      public static void menorelemento(){
        
        int menornumero = vetor[0];

        for( int i =0; i< vetor.length;i++){
            if(vetor[i] < menornumero){
                menornumero = vetor[i];
            }
        }

        System.out.println("Menor numero do vetor: " + menornumero);

    }
 

    public static void imprimevetor(){
      
        System.out.printf("Vetor alterado em forma final: ");
        System.out.println(Arrays.toString(vetor));
    }


    public static void substituirimparporzero(){
        
        for(int i = 0; i<vetor.length; i++){
            if(vetor[i]%2 != 0 ){
               vetor[i] = 0;
            }
        }
        System.out.println("Vetor alterado (numeros impares substituidos por zero): " + Arrays.toString(vetor));
    }
    
   


  }
 
    




    

