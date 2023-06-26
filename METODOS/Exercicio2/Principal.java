package METODOS.Exercicio2;
import java.util.Scanner;


public class Principal {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Integer linha = 3;
    Integer coluna = 5;
    int[][] numeros = new int [linha][coluna];
  
    System.out.println("Insira um numero:");
    int n = scanner.nextInt();


    for(int l=0;l<linha;l++){
        for(int c=0; c<coluna;c++){
          numeros[l][c] = (n * n);
         }
        }

        for(int l=0;l<linha;l++){
           for(int c=0; c<coluna;c++){
             System.out.printf("%d -",numeros[l][c]);
            }
          System.out.printf("%n");
        }
    scanner.close();
    }
 }   


//MATRIZ DE NUMEROS RANDOMICOS//
/*
 *   
    for(int l=0;l<linha;l++){
        for(int c=0;c<coluna;c++){
            numeros[l][c] = new SecureRandom().nextInt(100);
      }
    }

    
    for(int l=0;l<linha;l++){
        for(int c=0;c<coluna;c++){
            System.out.printf("::" + numeros[l][c]);
        }
        System.out.printf("%n");
    }
 */


