package ARRAY_LIST.Exercicio14;

import java.util.ArrayList;
import java.util.Scanner;


public class Principal {
    
    public static void main(String[] args) {
      Principal pr = new Principal();
      pr.met();

    }                 

    public void met(){
    Scanner scanner = new Scanner(System.in);
    ArrayList <Array2> lista3 = new ArrayList <Array2>();  
   
    Integer numero1;
    Integer numero2;

    System.out.println("Insira o primeiro numero:");
    numero1 = scanner.nextInt();

    System.out.println("Insira o segundo numero:");
    numero2 = scanner.nextInt();

    lista3.add(new Array2(numero1, numero2));

    for(Array2 lis : lista3){

      System.out.println("numero1: " + lis.numero1 + "  " + "numero2: " + lis.numero2 );
      System.out.println("Valor medio do array:" + (lis.numero1 + lis.numero2)/2);

      
    }
   
    

    scanner.close();
    }

}
