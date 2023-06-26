package LAMBDA.Pratico2;

import java.util.Scanner;
import java.util.ArrayList;


public class Principal {
    
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     ArrayList<Integer> numeros = new ArrayList<>();
     ArrayList<Integer> dobronumeros = new ArrayList<>(); 
     ArrayList<Integer> numerospares = new ArrayList<>();
     ArrayList<Integer> numerosimpares = new ArrayList<>();

    
     System.out.println("Insira o primeiro numero:");
     Integer numero1 = scanner.nextInt();

     System.out.println("Insira o segundo numero:");
     Integer numero2 = scanner.nextInt();
     
     numeros.add(numero1);
     numeros.add(numero2);
    

     numeros.forEach((E) -> {
       dobronumeros.add(E*2);
        if(E%2 == 0){
            numerospares.add(E);
        }else{
            numerosimpares.add(E);
        }
    
    });

     System.out.println(" ** RESULTADOS ** ");
     System.out.println("-------------------------------------------");

     System.out.println("ArrayList numeros:");
     System.out.printf(" " + numeros);

     System.out.println();
     System.out.println();

     System.out.println("ArrayList dobro numeros ");
     System.out.printf(" " + dobronumeros);

     System.out.println();
     System.out.println();

     System.out.println("ArrayList numeros pares:");
     System.out.printf(" " + numerospares);

     System.out.println();
     System.out.println();

     System.out.println("ArrayList numeros impares:");
     System.out.printf(" " + numerosimpares);

     scanner.close();
    }
    
}
